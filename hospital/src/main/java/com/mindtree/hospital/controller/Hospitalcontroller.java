package com.mindtree.hospital.controller;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hospital.entity.Doctor;
import com.mindtree.hospital.entity.Patient;
import com.mindtree.hospital.service.Doctorservice;
import com.mindtree.hospital.service.Patientservice;

@RestController
@RequestMapping("/api")
public class Hospitalcontroller {
	@Autowired
	private Doctorservice doctorservice;
	@Autowired
	private Patientservice patientservice;

	// method to insert patient assign to doctor
	@PostMapping(value = "/postpatient/{doctorName}/{patientName}/{doctorSpecialization}")
	public ResponseEntity<Map<String, Object>> postpatient(@PathVariable String doctorName, @PathVariable String patientName,
			@PathVariable String doctorSpecialization) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		List<Doctor> isInserted = null;
		isInserted = doctorservice.postdoctorservice(doctorName, patientName, doctorSpecialization);

		response.put("header", "list of doctor details");
		response.put("error", false);
		response.put("body", isInserted);
		response.put("Httpstatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

	// method to get doctor detail based on sorted order
	@GetMapping(value = "/getdoctorssorted")
	public List<Doctor> getdoctorsorted() throws IOException, ClassNotFoundException {
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors = doctorservice.getSalarySorted();

		List<Doctor> doctorone = new ArrayList<Doctor>();
		doctors = doctorservice.getalldetail();
		  List<Patient> patients = new ArrayList<Patient>();
		  patients = patientservice.getdetail();

		// writing data into file serialization
		FileOutputStream fos = new FileOutputStream("d://hospital.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(doctorone);
		oos.close();
		 //reading data from file deserializable
		/*
		 * FileInputStream fi= new FileInputStream("d://hospital.txt");
		 * ObjectInputStream input= new ObjectInputStream(fi); List<Doctor> doctor= new
		 * ArrayList<Doctor>(); try { while(true) { Doctor d=
		 * (Doctor)input.readObject(); doctor.add(d); } } catch(EOFException e) {
		 * 
		 * } for(Doctor doctorlist:doctor) { System.out.println(doctorlist); }
		 */
		 
		// writing data into file
		FileWriter writer = new FileWriter("d://patient.txt");
		for (Doctor str : doctors) {
			writer.write(str + System.lineSeparator());
		}
		writer.close();
		Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat, 
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        String[] columns = {"DoctorId", "DoctorName", "DoctorSalary","Specialization"};
        String[] columntwo = {"PatientId" ,"PatientName", "PatientBillAmount"};
        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }
        for(int j= doctors.size()+1;j<columntwo.length;j++) {
        	 Cell cell = headerRow.createCell(j);
             cell.setCellValue(columns[j]);
             cell.setCellStyle(headerCellStyle);
        }


        // Create Other rows and cells with employees data
        int rowNum = 1;
        for(Doctor doctortwo: doctors) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(doctortwo.getDoctorId());

            row.createCell(1)
                    .setCellValue(doctortwo.getDoctorName());
            row.createCell(2)
                    .setCellValue(doctortwo.getDoctorSalary());
            
            row.createCell(3)
            .setCellValue(doctortwo.getDoctorSpecialization());
            for(Patient patient:doctortwo.getPatient()) {
            	Row rowone = sheet.createRow(rowNum++);
            	 rowone.createCell(0)
                 .setCellValue(patient.getPatientId());

         rowone.createCell(1)
                 .setCellValue(patient.getPatientName());
         rowone.createCell(2)
                 .setCellValue(patient.getPatientBillamount());
            	
            }
            
        }
		/*
		 * int rownum =doctors.size(); for(Patient patientone:patients) { Row row =
		 * sheet.createRow(rowNum++); row.createCell(0)
		 * .setCellValue(patientone.getPatientId());
		 * 
		 * row.createCell(1) .setCellValue(patientone.getPatientName());
		 * row.createCell(2) .setCellValue(patientone.getPatientBillamount());
		 * 
		 * }
		 */
       
		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        for(int j = 0; j < columntwo.length; j++) {
            sheet.autoSizeColumn(j);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("D://customers.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
    
		

		return doctors;

	}

	// method to get doctor detail whose patient count is greater than 3
	@GetMapping(value = "/getdoctorcount")
	public ResponseEntity<Map<String, Object>> postpatientgetdoctorcount() {
	
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors = doctorservice.getpatientcount();
	
		response.put("header", "list of doctor details");
		response.put("error", false);
		response.put("body", doctors);
		response.put("Httpstatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

}

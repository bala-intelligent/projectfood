package com.niit.frontcrud.validator;

import org.springframework.validation.Errors;

import com.niit.frontcrud.model.FileUpload;

public class FileUploadValidator {

	public boolean supports(Class clazz) {
		//just validate the FileUpload instances
		return FileUpload.class.isAssignableFrom(clazz);
	}
	public void validate(Object target, Errors errors) {

		FileUpload file = (FileUpload)target;

		if(file.getFile().getSize()==0){
			errors.rejectValue("file", "required.fileUpload");
		}
	}
}

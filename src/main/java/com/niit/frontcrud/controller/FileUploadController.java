package com.niit.frontcrud.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/upload")
public class FileUploadController  {
	
	
	@RequestMapping(value="/process",method=RequestMethod.POST)
	public String save(HttpServletRequest request)
	{
		String path=request.getSession().getServletContext().getRealPath("/");
		path=path.substring(0,path.indexOf("\\build"));
		path=path+"\\webapp\\upload\\";
		DiskFileItemFactory d=new DiskFileItemFactory();
		ServletFileUpload uploader=new ServletFileUpload(d);
		try{
			List<FileItem>lst=uploader.parseRequest(request);
			for (FileItem fileItem:lst)
			{
				if(fileItem.isFormField()==false)
				{
					//writing file to upload folder
					fileItem.write(new File(path+"/"+fileItem.getName()));
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return "fail";
		}
		
				return "success";
	}
	
}


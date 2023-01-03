package com.demo.controller;

import com.demo.service.SachService;
import com.demo.entity.Sach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sach")
public class SachController {
	
	@Autowired
	public SachService sachService;
	@GetMapping("/")
	public ResponseEntity<List<Sach>> showSachList() {
		return ResponseEntity.ok(sachService.listAll());
	}
}

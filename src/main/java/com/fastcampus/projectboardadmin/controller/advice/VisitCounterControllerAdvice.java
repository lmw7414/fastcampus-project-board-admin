package com.fastcampus.projectboardadmin.controller.advice;

import com.fastcampus.projectboardadmin.service.VisitCounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@RequiredArgsConstructor
@ControllerAdvice
public class VisitCounterControllerAdvice {

    private final VisitCounterService visitCounterService;

    @ModelAttribute("visitCount")
    public long visitCount() {
        return visitCounterService.visitCount();
    }
}

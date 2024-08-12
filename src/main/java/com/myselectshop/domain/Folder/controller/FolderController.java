package com.myselectshop.domain.Folder.controller;

import com.myselectshop.domain.Folder.dto.FolderRequestDto;
import com.myselectshop.domain.Folder.service.FolderService;
import com.myselectshop.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FolderController {

    private final FolderService folderService;
    public FolderController(final FolderService folderService) {
        this.folderService = folderService;
    }

    @PostMapping("/folders")
    public void addFolders(@RequestBody FolderRequestDto folderRequestDto,
                           @AuthenticationPrincipal UserDetailsImpl userDetails) {

        List<String> folderNames = folderRequestDto.getFolderNames();

        folderService.addFolders(folderNames, userDetails.getUser());
    }


}

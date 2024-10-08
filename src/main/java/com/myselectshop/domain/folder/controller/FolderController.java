package com.myselectshop.domain.folder.controller;

import com.myselectshop.domain.folder.dto.FolderRequestDto;
import com.myselectshop.domain.folder.dto.FolderResponseDto;
import com.myselectshop.domain.folder.service.FolderService;
import com.myselectshop.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
    // 회원이 등록한 모든 폴더 조회
    @GetMapping("/folders")
    public List<FolderResponseDto> getFolders(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return folderService.getFolders(userDetails.getUser());
    }

}

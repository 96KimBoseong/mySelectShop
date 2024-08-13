package com.myselectshop.domain.folder.repository;

import com.myselectshop.domain.folder.model.Folder;
import com.myselectshop.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    List<Folder> findAllByUser(User user);
}

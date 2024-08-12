package com.myselectshop.domain.Folder.repository;

import com.myselectshop.domain.Folder.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

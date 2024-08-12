package com.myselectshop.domain.Folder.repository;

import com.myselectshop.domain.Folder.model.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
}

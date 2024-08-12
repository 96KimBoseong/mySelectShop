package com.myselectshop.domain.Folder.repository;

import com.myselectshop.domain.Folder.model.Folder;
import com.myselectshop.domain.Folder.model.ProductFolder;
import com.myselectshop.domain.myshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}

package com.queiroz.Gerenciamento_Autores.repositories;

import com.queiroz.Gerenciamento_Autores.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}

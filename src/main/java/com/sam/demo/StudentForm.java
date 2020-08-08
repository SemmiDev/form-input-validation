package com.sam.demo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.*;

@Data
@ToString
public class StudentForm {

    @NotNull(message = "tidak boleh kosong ya dek")
    @Size(min = 2, max = 30 ,message = "minimal 2 karakter dan maksimal 30 karakter")
    private String name;

    @NotNull(message = "tidak boleh kosong ya dek")
    @Email
    private String email;

    @NotNull(message = "tidak boleh kosong ya dek")
    @Min(value = 18, message = "minimal umur adek harus 18 yaaa")
    @Max(value = 40, message = "maksimal umur 45 awokaowkaowkaowkaowkaokwoakwoa")
    private Integer age;

    @NotNull(message = "tidak boleh kosong ya dek")
    @Size(min = 5, max = 5, message = "harus 5 karakter angka")
    private String nisn;
}
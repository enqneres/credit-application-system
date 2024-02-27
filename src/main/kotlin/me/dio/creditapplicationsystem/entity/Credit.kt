package me.dio.creditapplicationsystem.entity

import jakarta.persistence.*
import me.dio.creditapplicationsystem.enummeration.Status
import java.math.BigDecimal
import java.time.LocalDate

@Entity
@Table(name = "Credit")
data class Credit(
    @Column(nullable = false, unique = true) val creditCode: java.util.UUID = java.util.UUID.randomUUID(),
    @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false) val dayFirstInstallment: LocalDate,
    @Column(nullable = false) val numberOfInstallments: Int = 0,
   @Enumerated val status: Status = Status.IN_PROGRESS,
   @ManyToOne val customer: Customer? = null,
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)
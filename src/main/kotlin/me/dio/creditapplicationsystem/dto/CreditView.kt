package me.dio.creditapplicationsystem.dto

import jdk.jshell.Snippet.Status
import me.dio.creditapplicationsystem.entity.Credit
import org.hibernate.validator.constraints.UUID
import java.math.BigDecimal

data class CreditView (
    val creditCode: java.util.UUID,
    val creditValue: BigDecimal,
    val numberOfInstallments: Int,
    val status: me.dio.creditapplicationsystem.enummeration.Status,
    val emailCustomer: String?,
    val incomeCustomer: BigDecimal?
){
constructor(credit : Credit): this(
    creditCode = credit.creditCode,
    creditValue = credit.creditValue,
    numberOfInstallments = credit.numberOfInstallments,
    status = credit.status,
    emailCustomer = credit.customer?.email,
    incomeCustomer = credit.customer?.income
)
}

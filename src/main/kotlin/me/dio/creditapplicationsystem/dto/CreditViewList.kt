package me.dio.creditapplicationsystem.dto

import me.dio.creditapplicationsystem.entity.Credit
import java.math.BigDecimal

data class CreditViewList(
    val creditCode: java.util.UUID,
    val creditValue: BigDecimal,
    val numberOfInstallments: Int
)
{
    constructor(credit: Credit): this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments
    )
}

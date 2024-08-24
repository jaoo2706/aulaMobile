package Raça

import Habilidades

interface Raca {
    fun aplicarBonusRaca(habilidades: Habilidades)
    override fun toString(): String
}
package Raça

import Habilidades

class humano : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.forca += 1
        habilidades.destreza += 1
        habilidades.carisma += 1
        habilidades.constituicao += 1
        habilidades.sabedoria += 1
        habilidades.inteligencia += 1
    }
    override fun toString() : String {
        return "humano"
    }
}
package Raça

import Habilidades

class anãoMontanha : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.forca += 2
    }
    override fun toString() : String {
        return "anãoMontanha"
    }

}
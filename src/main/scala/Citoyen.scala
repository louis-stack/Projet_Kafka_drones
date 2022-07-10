case class Citoyen(idCitoyen: String, ScorePaixCitoyen: Int){
  val id: String = idCitoyen
  val scoreComportement: Int = ScorePaixCitoyen
}

object Citoyen {

  def citoyenAleatoire(): Citoyen = {
    val random = scala.util.Random
    val idCitoyen = 0 + random.nextInt(9999).toString
    val ScorePaixCitoyen  = 0 + random.nextInt(100)
    Citoyen(idCitoyen, ScorePaixCitoyen)
  }
}

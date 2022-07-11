package Main1

case class DroneRapport(id: String, latitude: Double, longitude: Double, listCitoyen: List[Citoyen], motsCitoyens: List[String])

object DroneRapport{

  def createDrone()={
    val random = scala.util.Random
    val id = random.nextInt(100).toString
    val latitude = (-90) + (90 - (-90)) * random.nextInt
    val longitude = (-180) + (180 - (-180)) * random.nextInt
    val mots:List[String] = List("oui", "bonjour", "revolution", "guerre", "toujours", "chien", "aurevoir", "violence", "tester", "tuer", "amour", "paix", "adoration", "demonter", "trucider", "mots", "je", "dois", "trouver", "des", "mots", "aleatoire", "et", "j'ai", "pas", "d'idee")
    val listCitoyen:List[Citoyen] = List.fill(1 + random.nextInt(19))(Citoyen.citoyenAleatoire())
    val motsCitoyens:List[String] = List.fill(5 + random.nextInt(25))(getRandomMot(mots))
    DroneRapport(id, latitude, longitude, listCitoyen, motsCitoyens)
  }
  def getRandomMot(listMots:List[String]): String = {
    listMots(scala.util.Random.nextInt(listMots.length - 1))
  }
  def randomString(length: Int): String = {
    // src : https://alvinalexander.com/scala/creating-random-strings-in-scala/  val random = new scala.util.Random
    val random = scala.util.Random
    val sb = new StringBuilder
    for (i <- 1 to length) {
      sb.append(random.nextPrintableChar)
    }
    sb.toString
   }


  def droneToJson(drone: DroneRapport): String = {

    val listCitoyens = drone.listCitoyen.map(citoyen => citoyen.id + ":" + citoyen.ScorePaixCitoyen).mkString(",")
    val words = drone.motsCitoyens.mkString(",")

    drone.id + ";" + drone.latitude + ";" + drone.longitude + ";" + listCitoyens + ";" + words
  }

}

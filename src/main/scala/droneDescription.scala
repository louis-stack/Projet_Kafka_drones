
case class droneDescription(id: String, latitude: Double, longitude: Double, idCitoyen: String, scorePaixCitoyen: Int, listCitoyen: List[Citoyen], motsCitoyens: String)

object droneRapport{

  def createDrone()={
    val random = scala.util.Random
    val id = random.nextInt(100).toString
    val latitude = (-90) + (90 - (-90)) * random.nextInt
    val longitude = (-180) + (180 - (-180)) * random.nextInt

    val citoyen = Citoyen.citoyenAleatoire()
    val idCitoyen = citoyen.idCitoyen
    val scorePaixCitoyen  = citoyen.ScorePaixCitoyen

    val listCitoyen:List[Citoyen] = List.fill(1 + random.nextInt(19))(Citoyen.citoyenAleatoire())
    val motsCitoyens = randomString(1 + random.nextInt(9))

    droneDescription(id, latitude, longitude, idCitoyen, scorePaixCitoyen, listCitoyen, motsCitoyens)
  }

  def randomString(length: Int) = {
    // src : https://alvinalexander.com/scala/creating-random-strings-in-scala/  val random = new scala.util.Random
    val random = scala.util.Random
    val sb = new StringBuilder
    for (i <- 1 to length) {
      sb.append(random.nextPrintableChar)
    }
    sb.toString
   }

  def droneToJson(drone: droneDescription): String = {

    val listCitoyens = drone.listCitoyen.map(citoyen => citoyen.id + ":" + citoyen.ScorePaixCitoyen).mkString(",")
    val words = drone.motsCitoyens.mkString(",")

    drone.id + ";" + drone.scorePaixCitoyen + ";" + drone.idCitoyen + ";" + drone.latitude + ";" + drone.longitude + ";" + listCitoyens + ";" + words
  }

}

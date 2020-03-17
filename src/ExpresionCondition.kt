fun main(){
    val isMarried= true
    val GPA= 3.7
    val isQualified = if (isMarried == true && GPA>=3.7) 1 else 0
    /*
    if (isMarried == true && GPA>=3.7){
    isQualified = 1
      }
      else {
      isQualified = 0
      }
     */
    print(isQualified)

    var isGood = when(isQualified){
        1-> true
        else-> false
    }
    println(isGood)
}
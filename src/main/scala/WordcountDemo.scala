import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by john_liu on 2017/12/9.
  */
object WordcountDemo extends App{

  //本地模式时，把setMaster打开
  val sparkConf = new SparkConf().setAppName("xiaohuo")
  .setMaster("local[*]")
  val sc = new SparkContext(sparkConf)
   sc
    .makeRDD(List("aaa","bbbb","aaa","ccc"))
    .map((_,1))
    .reduceByKey(_+_)
    .take(3)
    .map(println(_))


}

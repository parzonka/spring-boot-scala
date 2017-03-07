package app

import java.math.{BigDecimal => JavaBigDecimal}
 
import math.BigDecimal._
  
object DeepThought {
 
  def sum(a: JavaBigDecimal, b: JavaBigDecimal) = {
  	(a + b) bigDecimal
  }
 
}

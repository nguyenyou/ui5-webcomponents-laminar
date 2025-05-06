```scala
package io.github.nguyenyou.ui5.webcomponents.laminar.shared

import com.raquo.laminar.codecs.Codec

/** A utility for creating codecs for string union types. This can be used with literal union types like "A" | "B" | "C"
  * to create proper codecs.
  */
object StringUnionCodec {

  /** Creates a codec for a string union type.
    *
    * @tparam T
    *   The string union type (e.g., "A" | "B" | "C")
    * @return
    *   A codec that can encode/decode between T and String
    */
  def apply[T <: String]: Codec[T, String] = new Codec[T, String] {
    override def encode(scalaValue: T): String = scalaValue
    override def decode(domValue: String): T   = domValue.asInstanceOf[T] // scalafix:ok
  }
}
```

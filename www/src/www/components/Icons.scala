package www.components

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.Codec
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Acc
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesIconsMod.CollectionData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistryMod.registerIconLoader
import org.scalablytyped.runtime.StringDictionary

import scala.scalajs.js

object Icons {

  object CustomIconCodec {
    val collectionName = "custom"
    val prefix         = s"${collectionName}/"

    def apply[T <: String]: Codec[T, String] = new Codec[T, String] {
      override def encode(scalaValue: T): String = s"${prefix}${scalaValue}"

      override def decode(domValue: String): T = s"${domValue.substring(prefix.length)}".asInstanceOf[T] // scalafix:ok
    }
  }

  type CustomIcon = "Github" | "Download"
  lazy val icon: HtmlAttr[CustomIcon] = htmlAttr("icon", CustomIconCodec[CustomIcon])

  def scaleSvgPath(path: String, fromViewBoxSize: Double = 16, toViewBoxSize: Double = 512): String = {
    // Calculate the scale factor
    val scaleFactor = toViewBoxSize / fromViewBoxSize

    // Regular expression to find all numbers in the path
    val numberRegex = """-?\d*\.?\d+""".r
    // Replace all numbers with their scaled versions
    val scaledPath = numberRegex.replaceAllIn(path, m => {
      val number = m.group(0).toDouble
      val scaledNumber = number * scaleFactor

      // Format the scaled number appropriately
      if (scaledNumber.isWhole) {
        scaledNumber.toInt.toString
      } else {
        // Format floating point numbers with more precision
        // and keep trailing digits that are significant
        val formatted = f"$scaledNumber%.4f"
        formatted.replaceAll("""\.?0+$""", "")
      }
    })

    scaledPath
  }

  def IconPath(d: String): Acc = {
    Acc().setPath(d)
  }
  val customIconsLoader: js.Function1[String, js.Promise[CollectionData]] = name => {
    val data = CollectionData(
      collection = name,
      data = StringDictionary[Acc](
        "Github" -> IconPath("M256 32C132.3 32 32 134.9 32 261.7c0 101.5 64.2 187.5 153.2 217.9a17.56 17.56 0 0 0 3.8.4c8.3 0 11.5-6.1 11.5-11.4 0-5.5-.2-19.9-.3-39.1a102.4 102.4 0 0 1-22.6 2.7c-43.1 0-52.9-33.5-52.9-33.5-10.2-26.5-24.9-33.6-24.9-33.6-19.5-13.7-.1-14.1 1.4-14.1h.1c22.5 2 34.3 23.8 34.3 23.8 11.2 19.6 26.2 25.1 39.6 25.1a63 63 0 0 0 25.6-6c2-14.8 7.8-24.9 14.2-30.7-49.7-5.8-102-25.5-102-113.5 0-25.1 8.7-45.6 23-61.6-2.3-5.8-10-29.2 2.2-60.8a18.64 18.64 0 0 1 5-.5c8.1 0 26.4 3.1 56.6 24.1a208.21 208.21 0 0 1 112.2 0c30.2-21 48.5-24.1 56.6-24.1a18.64 18.64 0 0 1 5 .5c12.2 31.6 4.5 55 2.2 60.8 14.3 16.1 23 36.6 23 61.6 0 88.2-52.4 107.6-102.3 113.3 8 7.1 15.2 21.1 15.2 42.5 0 30.7-.3 55.5-.3 63 0 5.4 3.1 11.5 11.4 11.5a19.35 19.35 0 0 0 4-.4C415.9 449.2 480 363.1 480 261.7 480 134.9 379.7 32 256 32z"),
        "Download" -> IconPath(scaleSvgPath("M8 1.25C8.41421 1.25 8.75 1.58579 8.75 2V8.43934L11.7197 5.46967C12.0126 5.17678 12.4874 5.17678 12.7803 5.46967C13.0732 5.76256 13.0732 6.23744 12.7803 6.53033L8.53033 10.7803C8.23744 11.0732 7.76256 11.0732 7.46967 10.7803L3.21967 6.53033C2.92678 6.23744 2.92678 5.76256 3.21967 5.46967C3.51256 5.17678 3.98744 5.17678 4.28033 5.46967L7.25 8.43934V2C7.25 1.58579 7.58579 1.25 8 1.25ZM1.75 10C2.16421 10 2.5 10.3358 2.5 10.75V13.25C2.5 13.3881 2.61193 13.5 2.75 13.5H13.25C13.3881 13.5 13.5 13.3881 13.5 13.25V10.75C13.5 10.3358 13.8358 10 14.25 10C14.6642 10 15 10.3358 15 10.75V13.25C15 14.2165 14.2165 15 13.25 15H2.75C1.7835 15 1 14.2165 1 13.25V10.75C1 10.3358 1.33579 10 1.75 10Z"))
      ),
      packageName = "@ui5/webcomponents"
    )
    js.Promise.resolve(data)
  }
  def registerCustomIcons(): Unit = {
    registerIconLoader(CustomIconCodec.collectionName, customIconsLoader)
  }

  def Icon(
      d: String,
      height: String = "16",
      width: String = "16"
  ): SvgElement = {

    svg.svg(
      svg.height         := height,
      svg.strokeLineJoin := "round",
      svg.viewBox        := "0 0 16 16",
      svg.width          := width,
      svg.path(
        svg.fillRule := "evenodd",
        svg.clipRule := "evenodd",
        svg.d        := d,
        svg.fill     := "currentColor"
      )
    )
  }

  def codeIcon = Icon(
    "M7.22763 14.1819L10.2276 2.18193L10.4095 1.45432L8.95432 1.09052L8.77242 1.81812L5.77242 13.8181L5.59051 14.5457L7.04573 14.9095L7.22763 14.1819ZM3.75002 12.0607L3.21969 11.5304L0.39647 8.70713C0.00594559 8.31661 0.00594559 7.68344 0.39647 7.29292L3.21969 4.46969L3.75002 3.93936L4.81068 5.00002L4.28035 5.53035L1.81068 8.00003L4.28035 10.4697L4.81068 11L3.75002 12.0607ZM12.25 12.0607L12.7804 11.5304L15.6036 8.70713C15.9941 8.31661 15.9941 7.68344 15.6036 7.29292L12.7804 4.46969L12.25 3.93936L11.1894 5.00002L11.7197 5.53035L14.1894 8.00003L11.7197 10.4697L11.1894 11L12.25 12.0607Z"
  )

  def windowIcon = Icon(
    "M2.75 2C1.7835 2 1 2.7835 1 3.75V12C0.447715 12 0 12.4477 0 13C0 13.5523 0.447715 14 1 14H15C15.5523 14 16 13.5523 16 13C16 12.4477 15.5523 12 15 12V3.75C15 2.7835 14.2165 2 13.25 2H2.75ZM13.5 12V3.75C13.5 3.61193 13.3881 3.5 13.25 3.5H2.75C2.61193 3.5 2.5 3.61193 2.5 3.75V12H13.5Z"
  )

}

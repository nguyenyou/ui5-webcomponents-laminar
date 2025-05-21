package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.BooleanAsAttrPresenceCodec

val compactSize: HtmlAttr[Boolean] = htmlAttr("data-ui5-compact-size", BooleanAsAttrPresenceCodec)
val CompactSizeClass               = "ui5-content-density-compact"

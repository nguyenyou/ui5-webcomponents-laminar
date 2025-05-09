package io.github.nguyenyou.ui5.webcomponents.laminar.shared

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.BooleanAsAttrPresenceCodec

val compactSize: HtmlAttr[Boolean] = htmlAttr("data-ui5-compact-size", BooleanAsAttrPresenceCodec)

package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.DOMHighResTimeStamp
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.StaticRange
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Children
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Html
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitAnchorHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitAnnotationMathMLAttri
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitAnnotationXmlMathMLAt
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitAreaHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitAudioHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitBaseHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitBlockquoteHTMLAttribu
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitButtonHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitCanvasHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitColHTMLAttributesHTML
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitColgroupHTMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitDataHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitDelHTMLAttributesHTML
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitDetailsHTMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitDialogHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitEmbedHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitFieldsetHTMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitFormHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLBRE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLBod
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLDLi
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLDat
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLDiv
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLEle
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLHRE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLHea
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLHeaAbout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLHtm
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLLeg
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLPar
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLPic
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLPre
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLSpa
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLTab
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLTabAbout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLTabAccessKey
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLTem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLTit
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLULi
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitHTMLAttributesHTMLUnk
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitIframeHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitImgHTMLAttributesHTML
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitInputHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitInsHTMLAttributesHTML
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitKeygenHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitLabelHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitLiHTMLAttributesHTMLL
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitLinkHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMActionMathMLAttribut
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMEncloseMathMLAttribu
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMErrorMathMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMFencedMathMLAttribut
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMFracMathMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMNMathMLAttributesMat
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMOMathMLAttributesMat
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMOverMathMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMPaddedMathMLAttribut
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMPhantomMathMLAttribu
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMPrescriptsMathMLAttr
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMRootMathMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMRowMathMLAttributesM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMSMathMLAttributesMat
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMSpaceMathMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMSqrtMathMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMStyleMathMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMSubMathMLAttributesM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMSubsupMathMLAttribut
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMSupMathMLAttributesM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMTableMathMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMTdMathMLAttributesMa
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMTextMathMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMTrMathMLAttributesMa
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMUnderMathMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMapHTMLAttributesHTML
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMarqueeHTMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMathMathMLAttributesM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMenuHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMetaHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMeterHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMiMathMLAttributesMat
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitMmultiScriptsMathMLAt
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitObjectHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitOlHTMLAttributesHTMLO
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitOptgroupHTMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitOptionHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitOutputHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitParamHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitProgressHTMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitQuoteHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGAnima
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGAnimaAbout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGAnimaAccentHeight
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGCircl
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGClipP
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGDefsE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGDescE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGEllip
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEBle
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFECol
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFECom
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEComAbout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFECon
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEDif
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEDis
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEDisAbout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEDro
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEFlo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEFun
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEFunAbout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEFunAccentHeight
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEFunAccessKey
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEGau
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEIma
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEMer
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEMerAbout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEMor
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEOff
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFEPoi
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFESpe
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFESpo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFETil
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFETur
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGFilte
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGForei
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGGElem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGImage
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGLineE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGLinea
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGMPath
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGMarke
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGMaskE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGMetad
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGPathE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGPatte
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGPolyg
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGPolyl
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGRadia
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGRectE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGSVGEl
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGSetEl
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGStopE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGSwitc
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGSymbo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGTSpan
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGTextE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGTextP
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGUseEl
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSVGAttributesSVGViewE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitScriptHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSelectHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSemanticsMathMLAttrib
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSlotHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitSourceHTMLAttributesH
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitStyleHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitTableHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitTdHTMLAttributesHTMLT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitTextareaHTMLAttribute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitThHTMLAttributesHTMLT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitTimeHTMLAttributesHTM
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitTrackHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.OmitVideoHTMLAttributesHT
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.Booleanish
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AnimationEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.CSSProperties
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.ClipboardEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.CompositionEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.DragEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.FocusEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.GenericEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.InputEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.KeyboardEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.PictureInPictureEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.PointerEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.SubmitEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedAnimationEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedClipboardEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedCompositionEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedDragEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedFocusEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedKeyboardEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedPictureInPictureEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedPointerEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedSubmitEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedTouchEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedTransitionEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedUIEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedWheelEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TouchEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TransitionEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.UIEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.WheelEventHandler
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.Key
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.Ref
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`3`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`additions removals`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`additions text`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`inline`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`lazy`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`no-referrer-when-downgrade`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`no-referrer`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`origin-when-cross-origin`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`plaintext-only`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`removals additions`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`removals text`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`same-origin`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`strict-origin-when-cross-origin`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`strict-origin`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`text additions`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`text removals`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`unsafe-url`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`until-found`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.additions
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.all
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ascending
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.assertive_
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.async
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.auto
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.both
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.characters
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.copy
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.date
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.descending
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dialog
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.done
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.eager
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.enter
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.execute
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.go
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.grammar
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.grid
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hide
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hint
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.horizontal
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inherit
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.link
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.list
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.listbox
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.location
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ltr
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.manual
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.menu
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.mixed
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.move
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.next
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.none
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.off
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.on
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.origin
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.other
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.page
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.polite_
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.popup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.previous
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.removals
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.rtl
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.search
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.send
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.sentences
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.show
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.spelling
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.step
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.sync
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.text
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.time
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.toggle
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tree
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.vertical
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.words
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DataTransfer
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.SVGElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsxRuntimeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/jsx-runtime.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Fragment(props: Record[String, Any]): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(props.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren]
  inline def Fragment(props: Record[String, Any], context: Any): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren = (^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren]
  
  inline def jsx(`type`: Instantiable0[default] & TypeofUI5Element, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsx(`type`: String, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  inline def jsxDEV(`type`: Instantiable0[default] & TypeofUI5Element, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxDEV(`type`: String, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  inline def jsxs(`type`: Instantiable0[default] & TypeofUI5Element, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxs(`type`: String, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  type ComponentChild = js.UndefOr[VNode[Any] | js.Object | String | Double | js.BigInt | Boolean | Null]
  
  type ComponentChildren = js.Array[ComponentChild] | ComponentChild
  
  object JSX_ {
    
    type AllHTMLAttributes[T /* <: EventTarget */] = AllHTMLAttributesWithClassObj[T]
    
    /* Inlined std.Omit<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module.JSX.AllHTMLAttributes<T>, 'class'> & {  class :object | string | undefined} */
    trait AllHTMLAttributesWithClassObj[T /* <: EventTarget */] extends StObject {
      
      var default: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var about: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var accept: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `accept-charset`: js.UndefOr[Signalish[js.UndefOr[Signalish[js.UndefOr[String]]]]] = js.undefined
      
      var acceptCharset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var accessKey: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var accesskey: js.UndefOr[Signalish[js.UndefOr[Signalish[js.UndefOr[String]]]]] = js.undefined
      
      var action: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var allow: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var allowFullScreen: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var allowTransparency: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var alt: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-activedescendant`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-atomic`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-autocomplete`: js.UndefOr[Signalish[js.UndefOr[none | `inline` | list | both]]] = js.undefined
      
      var `aria-braillelabel`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-brailleroledescription`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-busy`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-checked`: js.UndefOr[Signalish[js.UndefOr[Booleanish | mixed]]] = js.undefined
      
      var `aria-colcount`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-colindex`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-colindextext`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-colspan`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-controls`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-current`: js.UndefOr[Signalish[js.UndefOr[Booleanish | page | step | location | date | time]]] = js.undefined
      
      var `aria-describedby`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-description`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-details`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-disabled`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-dropeffect`: js.UndefOr[Signalish[js.UndefOr[none | copy | execute | link | move | popup]]] = js.undefined
      
      var `aria-errormessage`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-expanded`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-flowto`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-grabbed`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-haspopup`: js.UndefOr[Signalish[js.UndefOr[Booleanish | menu | listbox | tree | grid | dialog]]] = js.undefined
      
      var `aria-hidden`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-invalid`: js.UndefOr[Signalish[js.UndefOr[Booleanish | grammar | spelling]]] = js.undefined
      
      var `aria-keyshortcuts`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-label`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-labelledby`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-level`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-live`: js.UndefOr[Signalish[js.UndefOr[off | assertive_ | polite_]]] = js.undefined
      
      var `aria-modal`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-multiline`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-multiselectable`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-orientation`: js.UndefOr[Signalish[js.UndefOr[horizontal | vertical]]] = js.undefined
      
      var `aria-owns`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-placeholder`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-posinset`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-pressed`: js.UndefOr[Signalish[js.UndefOr[Booleanish | mixed]]] = js.undefined
      
      var `aria-readonly`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-relevant`: js.UndefOr[
            Signalish[
              js.UndefOr[
                additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
              ]
            ]
          ] = js.undefined
      
      var `aria-required`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-roledescription`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-rowcount`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-rowindex`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-rowindextext`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-rowspan`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-selected`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-setsize`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-sort`: js.UndefOr[Signalish[js.UndefOr[none | ascending | descending | other]]] = js.undefined
      
      var `aria-valuemax`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-valuemin`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-valuenow`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-valuetext`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var as: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var async: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var autoCapitalize: js.UndefOr[Signalish[js.UndefOr[off | none | on | sentences | words | characters]]] = js.undefined
      
      var autoComplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var autoCorrect: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var autoFocus: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var autoPlay: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var autocapitalize: js.UndefOr[Signalish[js.UndefOr[off | none | on | sentences | words | characters]]] = js.undefined
      
      var autocomplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var autocorrect: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var autofocus: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var autoplay: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var capture: js.UndefOr[Signalish[js.UndefOr[Boolean | String]]] = js.undefined
      
      var cellPadding: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var cellSpacing: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var challenge: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var charSet: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var charset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var checked: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var children: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
          ] = js.undefined
      
      var cite: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `class`: js.UndefOr[js.Object | String] = js.undefined
      
      var className: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var colSpan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var cols: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var colspan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var content: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var contentEditable: js.UndefOr[Signalish[js.UndefOr[Booleanish | _empty | `plaintext-only` | inherit]]] = js.undefined
      
      var contenteditable: js.UndefOr[
            Signalish[
              js.UndefOr[Signalish[js.UndefOr[Booleanish | _empty | `plaintext-only` | inherit]]]
            ]
          ] = js.undefined
      
      var contextMenu: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var contextmenu: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var controls: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var controlsList: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var coords: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var crossOrigin: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var crossorigin: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
      
      var data: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var datatype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var dateTime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var datetime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var decoding: js.UndefOr[Signalish[js.UndefOr[sync | async | auto]]] = js.undefined
      
      var defaultChecked: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var defaultValue: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var defer: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var dir: js.UndefOr[Signalish[js.UndefOr[auto | rtl | ltr]]] = js.undefined
      
      var disablePictureInPicture: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var disableRemotePlayback: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var disabled: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var download: js.UndefOr[Signalish[js.UndefOr[Any]]] = js.undefined
      
      var draggable: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var elementTiming: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var elementtiming: js.UndefOr[Signalish[js.UndefOr[Signalish[js.UndefOr[String]]]]] = js.undefined
      
      var encType: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var enctype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var enterkeyhint: js.UndefOr[Signalish[js.UndefOr[enter | done | go | next | previous | search | send]]] = js.undefined
      
      var exportparts: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `for`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formAction: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formEncType: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formMethod: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formNoValidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var formTarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formaction: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formenctype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formmethod: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var formnovalidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var formtarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var frameBorder: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var frameborder: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var headers: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var height: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var hidden: js.UndefOr[
            Signalish[
              js.UndefOr[
                Boolean | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden | `until-found`
              ]
            ]
          ] = js.undefined
      
      var high: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var href: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var hrefLang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var hreflang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var htmlFor: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `http-equiv`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var httpEquiv: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var icon: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var id: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var indeterminate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var inert: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var inlist: js.UndefOr[Signalish[Any]] = js.undefined
      
      var inputMode: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var inputmode: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var integrity: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var is: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemID: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemProp: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemRef: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemScope: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var itemType: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemid: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemprop: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemref: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemscope: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var itemtype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var jsx: js.UndefOr[Boolean] = js.undefined
      
      var key: js.UndefOr[Key] = js.undefined
      
      var keyParams: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var keyType: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var kind: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var label: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var lang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var list: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var loading: js.UndefOr[Signalish[js.UndefOr[eager | `lazy`]]] = js.undefined
      
      var loop: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var low: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var manifest: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var marginHeight: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var marginWidth: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var max: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var maxLength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var maxlength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var media: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var mediaGroup: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var method: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var min: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var minLength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var minlength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var multiple: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var muted: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var noValidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var nomodule: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var nonce: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var novalidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var onAbort: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onAbortCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onBeforeInput: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onBeforeInputCapture: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onCanPlay: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCanPlayCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCanPlayThrough: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCanPlayThroughCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCancel: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onClick: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onClickCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onClose: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onContextMenu: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onContextMenuCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onDblClick: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onDblClickCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDurationChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onDurationChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEmptied: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEmptiedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEncrypted: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEncryptedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEnded: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEndedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEnterPictureInPicture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onEnterPictureInPictureCapture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onError: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onErrorCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusIn: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusInCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusOut: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusOutCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFormData: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onFormDataCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onInput: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onInputCapture: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onInvalid: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onInvalidCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onLeavePictureInPicture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onLeavePictureInPictureCapture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onLoad: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadStart: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadStartCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedData: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedDataCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedMetadata: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedMetadataCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onMouseDown: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseDownCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseEnter: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseEnterCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseLeave: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseLeaveCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseMove: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseMoveCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOut: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOutCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOver: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOverCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseUp: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseUpCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onPause: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPauseCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlay: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlayCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlaying: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlayingCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onProgress: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onProgressCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onRateChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onRateChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onReset: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onResetCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onResize: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onResizeCapture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
      
      var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
      
      var onScrollEnd: js.UndefOr[UIEventHandler[T]] = js.undefined
      
      var onSearch: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSearchCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeeked: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeekedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeeking: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeekingCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSelect: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSelectCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onStalled: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onStalledCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSubmit: js.UndefOr[SubmitEventHandler[T]] = js.undefined
      
      var onSubmitCapture: js.UndefOr[SubmitEventHandler[T]] = js.undefined
      
      var onSuspend: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSuspendCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onTimeUpdate: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onTimeUpdateCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onToggle: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTransitionCancel: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionCancelCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionRun: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionRunCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionStart: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionStartCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onVolumeChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onVolumeChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onWaiting: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onWaitingCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
      
      var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
      
      var open: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var optimum: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var part: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var pattern: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var ping: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var placeholder: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var playsInline: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var playsinline: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var popover: js.UndefOr[Signalish[js.UndefOr[auto | hint | manual | Boolean]]] = js.undefined
      
      var popoverTarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var popoverTargetAction: js.UndefOr[Signalish[js.UndefOr[hide | show | toggle]]] = js.undefined
      
      var popovertarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var popovertargetaction: js.UndefOr[Signalish[js.UndefOr[hide | show | toggle]]] = js.undefined
      
      var poster: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var prefix: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var preload: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var property: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var radioGroup: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var readOnly: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var readonly: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var ref: js.UndefOr[Ref[T]] = js.undefined
      
      var referrerpolicy: js.UndefOr[
            Signalish[
              js.UndefOr[
                `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
              ]
            ]
          ] = js.undefined
      
      var rel: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var required: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var resource: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var results: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var reversed: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var role: js.UndefOr[
            Signalish[
              js.UndefOr[
                io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AriaRole
              ]
            ]
          ] = js.undefined
      
      var rowSpan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var rows: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var rowspan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var sandbox: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var scope: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var scoped: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var scrolling: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var seamless: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var selected: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var shape: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var size: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var sizes: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var slot: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var span: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var spellcheck: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var src: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var srcDoc: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var srcLang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var srcSet: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var srcdoc: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var srclang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var srcset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var start: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var step: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var style: js.UndefOr[Signalish[js.UndefOr[String | CSSProperties]]] = js.undefined
      
      var summary: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var tabIndex: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var tabindex: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var target: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var title: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var translate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var `type`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var typeof: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var useMap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var usemap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var value: js.UndefOr[Signalish[js.UndefOr[String | js.Array[String] | Double]]] = js.undefined
      
      var vocab: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var volume: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
      
      var width: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
      
      var wmode: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var wrap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
    }
    object AllHTMLAttributesWithClassObj {
      
      inline def apply[T /* <: EventTarget */](): AllHTMLAttributesWithClassObj[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AllHTMLAttributesWithClassObj[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AllHTMLAttributesWithClassObj[?], T /* <: EventTarget */] (val x: Self & AllHTMLAttributesWithClassObj[T]) extends AnyVal {
        
        inline def setAbout(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
        
        inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
        
        inline def setAccept(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        inline def `setAccept-charset`(value: Signalish[js.UndefOr[Signalish[js.UndefOr[String]]]]): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
        
        inline def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
        
        inline def setAcceptCharset(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
        
        inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
        
        inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        inline def setAccessKey(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        inline def setAction(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setAllow(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
        
        inline def setAllowFullScreen(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
        
        inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
        
        inline def setAllowTransparency(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
        
        inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
        
        inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
        
        inline def setAlt(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def `setAria-activedescendant`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
        
        inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
        
        inline def `setAria-atomic`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
        
        inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
        
        inline def `setAria-autocomplete`(value: Signalish[js.UndefOr[none | `inline` | list | both]]): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
        
        inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
        
        inline def `setAria-braillelabel`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
        
        inline def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
        
        inline def `setAria-brailleroledescription`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
        
        inline def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
        
        inline def `setAria-busy`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
        
        inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
        
        inline def `setAria-checked`(value: Signalish[js.UndefOr[Booleanish | mixed]]): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
        
        inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
        
        inline def `setAria-colcount`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
        
        inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
        
        inline def `setAria-colindex`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
        
        inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
        
        inline def `setAria-colindextext`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
        
        inline def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
        
        inline def `setAria-colspan`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
        
        inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
        
        inline def `setAria-controls`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
        
        inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
        
        inline def `setAria-current`(value: Signalish[js.UndefOr[Booleanish | page | step | location | date | time]]): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
        
        inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
        
        inline def `setAria-describedby`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
        
        inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
        
        inline def `setAria-description`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
        
        inline def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
        
        inline def `setAria-details`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
        
        inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
        
        inline def `setAria-disabled`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
        
        inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
        
        inline def `setAria-dropeffect`(value: Signalish[js.UndefOr[none | copy | execute | link | move | popup]]): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
        
        inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
        
        inline def `setAria-errormessage`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
        
        inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
        
        inline def `setAria-expanded`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
        
        inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
        
        inline def `setAria-flowto`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
        
        inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
        
        inline def `setAria-grabbed`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
        
        inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
        
        inline def `setAria-haspopup`(value: Signalish[js.UndefOr[Booleanish | menu | listbox | tree | grid | dialog]]): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
        
        inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
        
        inline def `setAria-hidden`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
        
        inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
        
        inline def `setAria-invalid`(value: Signalish[js.UndefOr[Booleanish | grammar | spelling]]): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
        
        inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
        
        inline def `setAria-keyshortcuts`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
        
        inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
        
        inline def `setAria-label`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
        
        inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
        
        inline def `setAria-labelledby`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
        
        inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
        
        inline def `setAria-level`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
        
        inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
        
        inline def `setAria-live`(value: Signalish[js.UndefOr[off | assertive_ | polite_]]): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
        
        inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
        
        inline def `setAria-modal`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
        
        inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
        
        inline def `setAria-multiline`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
        
        inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
        
        inline def `setAria-multiselectable`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
        
        inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
        
        inline def `setAria-orientation`(value: Signalish[js.UndefOr[horizontal | vertical]]): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
        
        inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
        
        inline def `setAria-owns`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
        
        inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
        
        inline def `setAria-placeholder`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
        
        inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
        
        inline def `setAria-posinset`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
        
        inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
        
        inline def `setAria-pressed`(value: Signalish[js.UndefOr[Booleanish | mixed]]): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
        
        inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
        
        inline def `setAria-readonly`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
        
        inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
        
        inline def `setAria-relevant`(
          value: Signalish[
                  js.UndefOr[
                    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
                  ]
                ]
        ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
        
        inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
        
        inline def `setAria-required`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
        
        inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
        
        inline def `setAria-roledescription`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
        
        inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
        
        inline def `setAria-rowcount`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
        
        inline def `setAria-rowindex`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
        
        inline def `setAria-rowindextext`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
        
        inline def `setAria-rowspan`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
        
        inline def `setAria-selected`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
        
        inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
        
        inline def `setAria-setsize`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
        
        inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
        
        inline def `setAria-sort`(value: Signalish[js.UndefOr[none | ascending | descending | other]]): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
        
        inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
        
        inline def `setAria-valuemax`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
        
        inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
        
        inline def `setAria-valuemin`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
        
        inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
        
        inline def `setAria-valuenow`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
        
        inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
        
        inline def `setAria-valuetext`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
        
        inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
        
        inline def setAs(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
        
        inline def setAsync(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        inline def setAutoCapitalize(value: Signalish[js.UndefOr[off | none | on | sentences | words | characters]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
        
        inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
        
        inline def setAutoComplete(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
        
        inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
        
        inline def setAutoCorrect(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        inline def setAutoFocus(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
        
        inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
        
        inline def setAutoPlay(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
        
        inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
        
        inline def setCapture(value: Signalish[js.UndefOr[Boolean | String]]): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
        
        inline def setCellPadding(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
        
        inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
        
        inline def setCellSpacing(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
        
        inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
        
        inline def setChallenge(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
        
        inline def setCharSet(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
        
        inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
        
        inline def setChecked(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        inline def setChildren(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
        ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChild*
        ): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setCite(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
        
        inline def setClass(value: js.Object | String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        inline def setColSpan(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
        
        inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
        
        inline def setCols(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
        
        inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
        
        inline def setContent(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentEditable(value: Signalish[js.UndefOr[Booleanish | _empty | `plaintext-only` | inherit]]): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
        
        inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContextMenu(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
        
        inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
        
        inline def setControls(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        inline def setControlsList(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
        
        inline def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
        
        inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        inline def setCoords(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
        
        inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
        
        inline def setCrossOrigin(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
        
        inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
        
        inline def setData(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDatatype(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
        
        inline def setDateTime(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
        
        inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
        
        inline def setDecoding(value: Signalish[js.UndefOr[sync | async | auto]]): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
        
        inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
        
        inline def setDefault(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultChecked(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
        
        inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setDefaultValue(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
        
        inline def setDefer(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
        
        inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
        
        inline def setDir(value: Signalish[js.UndefOr[auto | rtl | ltr]]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        inline def setDisablePictureInPicture(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disablePictureInPicture", value.asInstanceOf[js.Any])
        
        inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
        
        inline def setDisableRemotePlayback(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disableRemotePlayback", value.asInstanceOf[js.Any])
        
        inline def setDisableRemotePlaybackUndefined: Self = StObject.set(x, "disableRemotePlayback", js.undefined)
        
        inline def setDisabled(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setDownload(value: Signalish[js.UndefOr[Any]]): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
        
        inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
        
        inline def setDraggable(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        inline def setElementTiming(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "elementTiming", value.asInstanceOf[js.Any])
        
        inline def setElementTimingUndefined: Self = StObject.set(x, "elementTiming", js.undefined)
        
        inline def setEncType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
        
        inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
        
        inline def setEnterkeyhint(value: Signalish[js.UndefOr[enter | done | go | next | previous | search | send]]): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
        
        inline def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
        
        inline def setExportparts(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "exportparts", value.asInstanceOf[js.Any])
        
        inline def setExportpartsUndefined: Self = StObject.set(x, "exportparts", js.undefined)
        
        inline def setFor(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
        
        inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
        
        inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormAction(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
        
        inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
        
        inline def setFormEncType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
        
        inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
        
        inline def setFormMethod(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
        
        inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
        
        inline def setFormNoValidate(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
        
        inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
        
        inline def setFormTarget(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
        
        inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setFrameBorder(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
        
        inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
        
        inline def setHeaders(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeight(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setHidden(value: Signalish[js.UndefOr[Boolean | hidden | `until-found`]]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setHigh(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
        
        inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
        
        inline def setHref(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        inline def setHrefLang(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
        
        inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
        
        inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
        
        inline def setHtmlFor(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
        
        inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
        
        inline def `setHttp-equiv`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "http-equiv", value.asInstanceOf[js.Any])
        
        inline def `setHttp-equivUndefined`: Self = StObject.set(x, "http-equiv", js.undefined)
        
        inline def setHttpEquiv(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
        
        inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
        
        inline def setIcon(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setId(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIndeterminate(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
        
        inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
        
        inline def setInert(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
        
        inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
        
        inline def setInlist(value: Signalish[Any]): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
        
        inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
        
        inline def setInputMode(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
        
        inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
        
        inline def setIntegrity(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        inline def setIs(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
        
        inline def setItemID(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
        
        inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
        
        inline def setItemProp(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
        
        inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
        
        inline def setItemRef(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
        
        inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
        
        inline def setItemScope(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
        
        inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
        
        inline def setItemType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
        
        inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
        
        inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
        
        inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyParams(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
        
        inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
        
        inline def setKeyType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
        
        inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setKind(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setLang(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
        
        inline def setList(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        inline def setLoading(value: Signalish[js.UndefOr[eager | `lazy`]]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
        
        inline def setLoop(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
        
        inline def setLow(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
        
        inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
        
        inline def setManifest(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
        
        inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
        
        inline def setMarginHeight(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
        
        inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
        
        inline def setMarginWidth(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
        
        inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
        
        inline def setMax(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxLength(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMedia(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        inline def setMediaGroup(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
        
        inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
        
        inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        inline def setMethod(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setMin(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinLength(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setMultiple(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        inline def setMuted(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
        
        inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
        
        inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNoValidate(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
        
        inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
        
        inline def setNomodule(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "nomodule", value.asInstanceOf[js.Any])
        
        inline def setNomoduleUndefined: Self = StObject.set(x, "nomodule", js.undefined)
        
        inline def setNonce(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        inline def setOnAbort(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
        
        inline def setOnAbortCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1(value))
        
        inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
        
        inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
        
        inline def setOnAnimationEnd(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
        
        inline def setOnAnimationEndCapture(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
        
        inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
        
        inline def setOnAnimationIteration(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
        
        inline def setOnAnimationIterationCapture(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1(value))
        
        inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
        
        inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
        
        inline def setOnAnimationStart(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
        
        inline def setOnAnimationStartCapture(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
        
        inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
        
        inline def setOnBeforeInput(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
        
        inline def setOnBeforeInputCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1(value))
        
        inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
        
        inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
        
        inline def setOnBlur(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
        
        inline def setOnBlurCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1(value))
        
        inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
        
        inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        inline def setOnCanPlay(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
        
        inline def setOnCanPlayThrough(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayThroughCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
        
        inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
        
        inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
        
        inline def setOnCancel(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
        
        inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
        
        inline def setOnChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        inline def setOnClick(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        
        inline def setOnClickCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1(value))
        
        inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        inline def setOnClose(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
        
        inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        inline def setOnCompositionEnd(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
        
        inline def setOnCompositionEndCapture(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
        
        inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
        
        inline def setOnCompositionStart(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
        
        inline def setOnCompositionStartCapture(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
        
        inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
        
        inline def setOnCompositionUpdate(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
        
        inline def setOnCompositionUpdateCapture(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1(value))
        
        inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
        
        inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
        
        inline def setOnContextMenu(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
        
        inline def setOnContextMenuCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1(value))
        
        inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
        
        inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
        
        inline def setOnCopy(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
        
        inline def setOnCopyCapture(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1(value))
        
        inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
        
        inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
        
        inline def setOnCut(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
        
        inline def setOnCutCapture(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1(value))
        
        inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
        
        inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
        
        inline def setOnDblClick(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
        
        inline def setOnDblClickCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onDblClickCapture", js.Any.fromFunction1(value))
        
        inline def setOnDblClickCaptureUndefined: Self = StObject.set(x, "onDblClickCapture", js.undefined)
        
        inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
        
        inline def setOnDrag(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
        
        inline def setOnDragCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
        
        inline def setOnDragEnd(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
        
        inline def setOnDragEndCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
        
        inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
        
        inline def setOnDragEnter(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
        
        inline def setOnDragEnterCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
        
        inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
        
        inline def setOnDragExit(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
        
        inline def setOnDragExitCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
        
        inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
        
        inline def setOnDragLeave(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
        
        inline def setOnDragLeaveCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
        
        inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
        
        inline def setOnDragOver(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
        
        inline def setOnDragOverCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
        
        inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
        
        inline def setOnDragStart(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
        
        inline def setOnDragStartCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
        
        inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
        
        inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
        
        inline def setOnDrop(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
        
        inline def setOnDropCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1(value))
        
        inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
        
        inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
        
        inline def setOnDurationChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
        
        inline def setOnDurationChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
        
        inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
        
        inline def setOnEmptied(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
        
        inline def setOnEmptiedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1(value))
        
        inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
        
        inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
        
        inline def setOnEncrypted(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
        
        inline def setOnEncryptedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1(value))
        
        inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
        
        inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
        
        inline def setOnEnded(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
        
        inline def setOnEndedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1(value))
        
        inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
        
        inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
        
        inline def setOnEnterPictureInPicture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onEnterPictureInPicture", js.Any.fromFunction1(value))
        
        inline def setOnEnterPictureInPictureCapture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onEnterPictureInPictureCapture", js.Any.fromFunction1(value))
        
        inline def setOnEnterPictureInPictureCaptureUndefined: Self = StObject.set(x, "onEnterPictureInPictureCapture", js.undefined)
        
        inline def setOnEnterPictureInPictureUndefined: Self = StObject.set(x, "onEnterPictureInPicture", js.undefined)
        
        inline def setOnError(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
        
        inline def setOnErrorCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1(value))
        
        inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
        
        inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        inline def setOnFocus(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        inline def setOnFocusCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1(value))
        
        inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
        
        inline def setOnFocusIn(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
        
        inline def setOnFocusInCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusInCapture", js.Any.fromFunction1(value))
        
        inline def setOnFocusInCaptureUndefined: Self = StObject.set(x, "onFocusInCapture", js.undefined)
        
        inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
        
        inline def setOnFocusOut(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
        
        inline def setOnFocusOutCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusOutCapture", js.Any.fromFunction1(value))
        
        inline def setOnFocusOutCaptureUndefined: Self = StObject.set(x, "onFocusOutCapture", js.undefined)
        
        inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
        
        inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        inline def setOnFormData(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onFormData", js.Any.fromFunction1(value))
        
        inline def setOnFormDataCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onFormDataCapture", js.Any.fromFunction1(value))
        
        inline def setOnFormDataCaptureUndefined: Self = StObject.set(x, "onFormDataCapture", js.undefined)
        
        inline def setOnFormDataUndefined: Self = StObject.set(x, "onFormData", js.undefined)
        
        inline def setOnGotPointerCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1(value))
        
        inline def setOnGotPointerCaptureCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1(value))
        
        inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
        
        inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
        
        inline def setOnInput(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
        
        inline def setOnInputCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1(value))
        
        inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
        
        inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
        
        inline def setOnInvalid(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
        
        inline def setOnInvalidCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1(value))
        
        inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
        
        inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
        
        inline def setOnKeyDown(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
        
        inline def setOnKeyDownCapture(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1(value))
        
        inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
        
        inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
        
        inline def setOnKeyPress(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
        
        inline def setOnKeyPressCapture(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1(value))
        
        inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
        
        inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
        
        inline def setOnKeyUp(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
        
        inline def setOnKeyUpCapture(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1(value))
        
        inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
        
        inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
        
        inline def setOnLeavePictureInPicture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onLeavePictureInPicture", js.Any.fromFunction1(value))
        
        inline def setOnLeavePictureInPictureCapture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onLeavePictureInPictureCapture", js.Any.fromFunction1(value))
        
        inline def setOnLeavePictureInPictureCaptureUndefined: Self = StObject.set(x, "onLeavePictureInPictureCapture", js.undefined)
        
        inline def setOnLeavePictureInPictureUndefined: Self = StObject.set(x, "onLeavePictureInPicture", js.undefined)
        
        inline def setOnLoad(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
        
        inline def setOnLoadCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
        
        inline def setOnLoadStart(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
        
        inline def setOnLoadStartCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
        
        inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
        
        inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
        
        inline def setOnLoadedData(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
        
        inline def setOnLoadedDataCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
        
        inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
        
        inline def setOnLoadedMetadata(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
        
        inline def setOnLoadedMetadataCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
        
        inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
        
        inline def setOnLostPointerCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1(value))
        
        inline def setOnLostPointerCaptureCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1(value))
        
        inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
        
        inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
        
        inline def setOnMouseDown(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
        
        inline def setOnMouseDownCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
        
        inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
        
        inline def setOnMouseEnter(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
        
        inline def setOnMouseEnterCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseEnterCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseEnterCaptureUndefined: Self = StObject.set(x, "onMouseEnterCapture", js.undefined)
        
        inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
        
        inline def setOnMouseLeave(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
        
        inline def setOnMouseLeaveCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseLeaveCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseLeaveCaptureUndefined: Self = StObject.set(x, "onMouseLeaveCapture", js.undefined)
        
        inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
        
        inline def setOnMouseMove(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
        
        inline def setOnMouseMoveCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
        
        inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
        
        inline def setOnMouseOut(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
        
        inline def setOnMouseOutCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
        
        inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
        
        inline def setOnMouseOver(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
        
        inline def setOnMouseOverCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
        
        inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
        
        inline def setOnMouseUp(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
        
        inline def setOnMouseUpCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
        
        inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
        
        inline def setOnPaste(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
        
        inline def setOnPasteCapture(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1(value))
        
        inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
        
        inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
        
        inline def setOnPause(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
        
        inline def setOnPauseCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1(value))
        
        inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
        
        inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
        
        inline def setOnPlay(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
        
        inline def setOnPlayCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1(value))
        
        inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
        
        inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
        
        inline def setOnPlaying(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
        
        inline def setOnPlayingCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1(value))
        
        inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
        
        inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
        
        inline def setOnPointerCancel(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
        
        inline def setOnPointerCancelCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
        
        inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
        
        inline def setOnPointerDown(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
        
        inline def setOnPointerDownCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
        
        inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
        
        inline def setOnPointerEnter(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
        
        inline def setOnPointerEnterCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
        
        inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
        
        inline def setOnPointerLeave(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
        
        inline def setOnPointerLeaveCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
        
        inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
        
        inline def setOnPointerMove(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
        
        inline def setOnPointerMoveCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
        
        inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
        
        inline def setOnPointerOut(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
        
        inline def setOnPointerOutCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
        
        inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
        
        inline def setOnPointerOver(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
        
        inline def setOnPointerOverCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
        
        inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
        
        inline def setOnPointerUp(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
        
        inline def setOnPointerUpCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
        
        inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
        
        inline def setOnProgress(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
        
        inline def setOnProgressCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1(value))
        
        inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
        
        inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
        
        inline def setOnRateChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
        
        inline def setOnRateChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
        
        inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
        
        inline def setOnReset(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
        
        inline def setOnResetCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1(value))
        
        inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
        
        inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
        
        inline def setOnResize(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
        
        inline def setOnResizeCapture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onResizeCapture", js.Any.fromFunction1(value))
        
        inline def setOnResizeCaptureUndefined: Self = StObject.set(x, "onResizeCapture", js.undefined)
        
        inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
        
        inline def setOnScroll(value: TargetedUIEvent[T] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
        
        inline def setOnScrollCapture(value: TargetedUIEvent[T] => Unit): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1(value))
        
        inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
        
        inline def setOnScrollEnd(value: TargetedUIEvent[T] => Unit): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction1(value))
        
        inline def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
        
        inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
        
        inline def setOnSearch(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
        
        inline def setOnSearchCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSearchCapture", js.Any.fromFunction1(value))
        
        inline def setOnSearchCaptureUndefined: Self = StObject.set(x, "onSearchCapture", js.undefined)
        
        inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
        
        inline def setOnSeeked(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
        
        inline def setOnSeekedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1(value))
        
        inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
        
        inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
        
        inline def setOnSeeking(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
        
        inline def setOnSeekingCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1(value))
        
        inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
        
        inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
        
        inline def setOnSelect(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        inline def setOnSelectCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1(value))
        
        inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
        
        inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
        
        inline def setOnStalled(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
        
        inline def setOnStalledCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1(value))
        
        inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
        
        inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
        
        inline def setOnSubmit(value: TargetedSubmitEvent[T] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
        
        inline def setOnSubmitCapture(value: TargetedSubmitEvent[T] => Unit): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1(value))
        
        inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
        
        inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
        
        inline def setOnSuspend(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
        
        inline def setOnSuspendCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1(value))
        
        inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
        
        inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
        
        inline def setOnTimeUpdate(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
        
        inline def setOnTimeUpdateCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1(value))
        
        inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
        
        inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
        
        inline def setOnToggle(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
        
        inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        inline def setOnTouchCancel(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
        
        inline def setOnTouchCancelCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
        
        inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
        
        inline def setOnTouchEnd(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
        
        inline def setOnTouchEndCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
        
        inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
        
        inline def setOnTouchMove(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
        
        inline def setOnTouchMoveCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
        
        inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
        
        inline def setOnTouchStart(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
        
        inline def setOnTouchStartCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
        
        inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
        
        inline def setOnTransitionCancel(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionCancel", js.Any.fromFunction1(value))
        
        inline def setOnTransitionCancelCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionCancelCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionCancelCaptureUndefined: Self = StObject.set(x, "onTransitionCancelCapture", js.undefined)
        
        inline def setOnTransitionCancelUndefined: Self = StObject.set(x, "onTransitionCancel", js.undefined)
        
        inline def setOnTransitionEnd(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
        
        inline def setOnTransitionEndCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
        
        inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
        
        inline def setOnTransitionRun(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionRun", js.Any.fromFunction1(value))
        
        inline def setOnTransitionRunCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionRunCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionRunCaptureUndefined: Self = StObject.set(x, "onTransitionRunCapture", js.undefined)
        
        inline def setOnTransitionRunUndefined: Self = StObject.set(x, "onTransitionRun", js.undefined)
        
        inline def setOnTransitionStart(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction1(value))
        
        inline def setOnTransitionStartCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionStartCaptureUndefined: Self = StObject.set(x, "onTransitionStartCapture", js.undefined)
        
        inline def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
        
        inline def setOnVolumeChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
        
        inline def setOnVolumeChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
        
        inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
        
        inline def setOnWaiting(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
        
        inline def setOnWaitingCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1(value))
        
        inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
        
        inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
        
        inline def setOnWheel(value: TargetedWheelEvent[T] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
        
        inline def setOnWheelCapture(value: TargetedWheelEvent[T] => Unit): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1(value))
        
        inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
        
        inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
        
        inline def setOpen(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
        
        inline def setOptimum(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
        
        inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
        
        inline def setPart(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
        
        inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
        
        inline def setPattern(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        inline def setPing(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
        
        inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
        
        inline def setPlaceholder(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setPlaysInline(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
        
        inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
        
        inline def setPopover(value: Signalish[js.UndefOr[auto | hint | manual | Boolean]]): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
        
        inline def setPopoverTarget(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "popoverTarget", value.asInstanceOf[js.Any])
        
        inline def setPopoverTargetAction(value: Signalish[js.UndefOr[hide | show | toggle]]): Self = StObject.set(x, "popoverTargetAction", value.asInstanceOf[js.Any])
        
        inline def setPopoverTargetActionUndefined: Self = StObject.set(x, "popoverTargetAction", js.undefined)
        
        inline def setPopoverTargetUndefined: Self = StObject.set(x, "popoverTarget", js.undefined)
        
        inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
        
        inline def setPoster(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
        
        inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
        
        inline def setPrefix(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setPreload(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
        
        inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
        
        inline def setProperty(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
        
        inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
        
        inline def setRadioGroup(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
        
        inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
        
        inline def setReadOnly(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        inline def setRef(value: Ref[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        inline def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
        
        inline def setRefNull: Self = StObject.set(x, "ref", null)
        
        inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
        
        inline def setReferrerpolicy(
          value: Signalish[
                  js.UndefOr[
                    `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
                  ]
                ]
        ): Self = StObject.set(x, "referrerpolicy", value.asInstanceOf[js.Any])
        
        inline def setReferrerpolicyUndefined: Self = StObject.set(x, "referrerpolicy", js.undefined)
        
        inline def setRel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
        
        inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
        
        inline def setRequired(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        inline def setResource(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setResults(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
        
        inline def setReversed(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
        
        inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
        
        inline def setRole(
          value: Signalish[
                  js.UndefOr[
                    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AriaRole
                  ]
                ]
        ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setRowSpan(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
        
        inline def setRows(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setSandbox(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
        
        inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
        
        inline def setScope(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setScoped(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
        
        inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
        
        inline def setScrolling(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
        
        inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
        
        inline def setSeamless(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
        
        inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
        
        inline def setSelected(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        inline def setShape(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        inline def setSize(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setSizes(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
        
        inline def setSlot(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        inline def setSpan(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
        
        inline def setSpellcheck(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
        
        inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
        
        inline def setSrc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        inline def setSrcDoc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
        
        inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
        
        inline def setSrcLang(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
        
        inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
        
        inline def setSrcSet(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
        
        inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
        
        inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
        
        inline def setStart(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        inline def setStep(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
        
        inline def setStyle(value: Signalish[js.UndefOr[String | CSSProperties]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setSummary(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setTabIndex(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        inline def setTarget(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setTitle(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTranslate(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
        
        inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
        
        inline def setType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setTypeof(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
        
        inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
        
        inline def setUseMap(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
        
        inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
        
        inline def setValue(value: Signalish[js.UndefOr[String | js.Array[String] | Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
        
        inline def setVocab(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
        
        inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
        
        inline def setVolume(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
        
        inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
        
        inline def setWidth(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setWmode(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
        
        inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
        
        inline def setWrap(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
        
        inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      }
    }
    
    type AriaRole = io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AriaRole
    
    type DOMAttributes[T /* <: EventTarget */] = io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.DOMAttributes[T]
    
    /* Inlined parent @ui5/webcomponents-base.@ui5/webcomponents-base/dist/jsx-runtime.VNode<any> */
    trait Element extends StObject {
      
      var endTime: js.UndefOr[Double] = js.undefined
      
      var key: Key
      
      var props: Any & Children
      
      var ref: js.UndefOr[Ref[Any] | Null] = js.undefined
      
      var startTime: js.UndefOr[Double] = js.undefined
      
      var `type`: String | (Instantiable0[default] & TypeofUI5Element)
    }
    object Element {
      
      inline def apply(key: Key, props: Any & Children, `type`: String | (Instantiable0[default] & TypeofUI5Element)): Element = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setProps(value: Any & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
        
        inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
        
        inline def setRefNull: Self = StObject.set(x, "ref", null)
        
        inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
        
        inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setType(value: String | (Instantiable0[default] & TypeofUI5Element)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait ElementAttributesProperty[T /* <: EventTarget */] extends StObject {
      
      var _jsxProps: HTMLAttributes[T]
    }
    object ElementAttributesProperty {
      
      inline def apply[T /* <: EventTarget */](_jsxProps: HTMLAttributes[T]): ElementAttributesProperty[T] = {
        val __obj = js.Dynamic.literal(_jsxProps = _jsxProps.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementAttributesProperty[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ElementAttributesProperty[?], T /* <: EventTarget */] (val x: Self & ElementAttributesProperty[T]) extends AnyVal {
        
        inline def set_jsxProps(value: HTMLAttributes[T]): Self = StObject.set(x, "_jsxProps", value.asInstanceOf[js.Any])
      }
    }
    
    type ElementClass = default
    
    type HTMLAttributes[T /* <: EventTarget */] = HTMLAttributesWithClassObj[T]
    
    /* Inlined std.Omit<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module.JSX.HTMLAttributes<T>, 'class'> & {  class :object | string | undefined} */
    trait HTMLAttributesWithClassObj[T /* <: EventTarget */] extends StObject {
      
      var about: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var accessKey: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var accesskey: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-activedescendant`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-atomic`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-autocomplete`: js.UndefOr[Signalish[js.UndefOr[none | `inline` | list | both]]] = js.undefined
      
      var `aria-braillelabel`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-brailleroledescription`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-busy`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-checked`: js.UndefOr[Signalish[js.UndefOr[Booleanish | mixed]]] = js.undefined
      
      var `aria-colcount`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-colindex`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-colindextext`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-colspan`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-controls`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-current`: js.UndefOr[Signalish[js.UndefOr[Booleanish | page | step | location | date | time]]] = js.undefined
      
      var `aria-describedby`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-description`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-details`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-disabled`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-dropeffect`: js.UndefOr[Signalish[js.UndefOr[none | copy | execute | link | move | popup]]] = js.undefined
      
      var `aria-errormessage`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-expanded`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-flowto`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-grabbed`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-haspopup`: js.UndefOr[Signalish[js.UndefOr[Booleanish | menu | listbox | tree | grid | dialog]]] = js.undefined
      
      var `aria-hidden`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-invalid`: js.UndefOr[Signalish[js.UndefOr[Booleanish | grammar | spelling]]] = js.undefined
      
      var `aria-keyshortcuts`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-label`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-labelledby`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-level`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-live`: js.UndefOr[Signalish[js.UndefOr[off | assertive_ | polite_]]] = js.undefined
      
      var `aria-modal`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-multiline`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-multiselectable`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-orientation`: js.UndefOr[Signalish[js.UndefOr[horizontal | vertical]]] = js.undefined
      
      var `aria-owns`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-placeholder`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-posinset`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-pressed`: js.UndefOr[Signalish[js.UndefOr[Booleanish | mixed]]] = js.undefined
      
      var `aria-readonly`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-relevant`: js.UndefOr[
            Signalish[
              js.UndefOr[
                additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
              ]
            ]
          ] = js.undefined
      
      var `aria-required`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-roledescription`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-rowcount`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-rowindex`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-rowindextext`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var `aria-rowspan`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-selected`: js.UndefOr[Signalish[js.UndefOr[Booleanish]]] = js.undefined
      
      var `aria-setsize`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-sort`: js.UndefOr[Signalish[js.UndefOr[none | ascending | descending | other]]] = js.undefined
      
      var `aria-valuemax`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-valuemin`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-valuenow`: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var `aria-valuetext`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var autoCapitalize: js.UndefOr[Signalish[js.UndefOr[off | none | on | sentences | words | characters]]] = js.undefined
      
      var autoCorrect: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var autoFocus: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var autocapitalize: js.UndefOr[Signalish[js.UndefOr[off | none | on | sentences | words | characters]]] = js.undefined
      
      var autocorrect: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var autofocus: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var children: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
          ] = js.undefined
      
      var `class`: js.UndefOr[js.Object | String] = js.undefined
      
      var className: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var contentEditable: js.UndefOr[Signalish[js.UndefOr[Booleanish | _empty | `plaintext-only` | inherit]]] = js.undefined
      
      var contenteditable: js.UndefOr[Signalish[js.UndefOr[Booleanish | _empty | `plaintext-only` | inherit]]] = js.undefined
      
      var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
      
      var datatype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var dir: js.UndefOr[Signalish[js.UndefOr[auto | rtl | ltr]]] = js.undefined
      
      var disablePictureInPicture: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var draggable: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var elementTiming: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var elementtiming: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var enterkeyhint: js.UndefOr[Signalish[js.UndefOr[enter | done | go | next | previous | search | send]]] = js.undefined
      
      var exportparts: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var hidden: js.UndefOr[
            Signalish[
              js.UndefOr[
                Boolean | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden | `until-found`
              ]
            ]
          ] = js.undefined
      
      var id: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var inert: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var inlist: js.UndefOr[Signalish[Any]] = js.undefined
      
      var inputMode: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var inputmode: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var is: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemID: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemProp: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemRef: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemScope: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var itemType: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemid: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemprop: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemref: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var itemscope: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var itemtype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var jsx: js.UndefOr[Boolean] = js.undefined
      
      var key: js.UndefOr[Key] = js.undefined
      
      var lang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var nonce: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var onAbort: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onAbortCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
      
      var onBeforeInput: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onBeforeInputCapture: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onCanPlay: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCanPlayCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCanPlayThrough: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCanPlayThroughCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCancel: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onClick: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onClickCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onClose: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
      
      var onContextMenu: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onContextMenuCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onDblClick: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onDblClickCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
      
      var onDurationChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onDurationChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEmptied: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEmptiedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEncrypted: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEncryptedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEnded: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEndedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onEnterPictureInPicture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onEnterPictureInPictureCapture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onError: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onErrorCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusIn: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusInCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusOut: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFocusOutCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
      
      var onFormData: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onFormDataCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onInput: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onInputCapture: js.UndefOr[InputEventHandler[T]] = js.undefined
      
      var onInvalid: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onInvalidCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
      
      var onLeavePictureInPicture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onLeavePictureInPictureCapture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onLoad: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadStart: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadStartCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedData: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedDataCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedMetadata: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLoadedMetadataCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onMouseDown: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseDownCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseEnter: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseEnterCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseLeave: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseLeaveCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseMove: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseMoveCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOut: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOutCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOver: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseOverCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseUp: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onMouseUpCapture: js.UndefOr[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
          ] = js.undefined
      
      var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
      
      var onPause: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPauseCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlay: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlayCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlaying: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPlayingCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
      
      var onProgress: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onProgressCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onRateChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onRateChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onReset: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onResetCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onResize: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onResizeCapture: js.UndefOr[PictureInPictureEventHandler[T]] = js.undefined
      
      var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
      
      var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
      
      var onScrollEnd: js.UndefOr[UIEventHandler[T]] = js.undefined
      
      var onSearch: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSearchCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeeked: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeekedCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeeking: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSeekingCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSelect: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSelectCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onStalled: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onStalledCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSubmit: js.UndefOr[SubmitEventHandler[T]] = js.undefined
      
      var onSubmitCapture: js.UndefOr[SubmitEventHandler[T]] = js.undefined
      
      var onSuspend: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onSuspendCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onTimeUpdate: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onTimeUpdateCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onToggle: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
      
      var onTransitionCancel: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionCancelCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionRun: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionRunCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionStart: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onTransitionStartCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
      
      var onVolumeChange: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onVolumeChangeCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onWaiting: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onWaitingCapture: js.UndefOr[GenericEventHandler[T]] = js.undefined
      
      var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
      
      var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
      
      var part: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var popover: js.UndefOr[Signalish[js.UndefOr[auto | hint | manual | Boolean]]] = js.undefined
      
      var prefix: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var property: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var ref: js.UndefOr[Ref[T]] = js.undefined
      
      var resource: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var results: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var role: js.UndefOr[
            Signalish[
              js.UndefOr[
                io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AriaRole
              ]
            ]
          ] = js.undefined
      
      var slot: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var spellcheck: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var style: js.UndefOr[Signalish[js.UndefOr[String | CSSProperties]]] = js.undefined
      
      var tabIndex: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var tabindex: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
      
      var title: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var translate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
      
      var typeof: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
      
      var vocab: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
    }
    object HTMLAttributesWithClassObj {
      
      inline def apply[T /* <: EventTarget */](): HTMLAttributesWithClassObj[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributesWithClassObj[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLAttributesWithClassObj[?], T /* <: EventTarget */] (val x: Self & HTMLAttributesWithClassObj[T]) extends AnyVal {
        
        inline def setAbout(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
        
        inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
        
        inline def setAccessKey(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        inline def `setAria-activedescendant`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
        
        inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
        
        inline def `setAria-atomic`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
        
        inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
        
        inline def `setAria-autocomplete`(value: Signalish[js.UndefOr[none | `inline` | list | both]]): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
        
        inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
        
        inline def `setAria-braillelabel`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
        
        inline def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
        
        inline def `setAria-brailleroledescription`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
        
        inline def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
        
        inline def `setAria-busy`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
        
        inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
        
        inline def `setAria-checked`(value: Signalish[js.UndefOr[Booleanish | mixed]]): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
        
        inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
        
        inline def `setAria-colcount`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
        
        inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
        
        inline def `setAria-colindex`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
        
        inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
        
        inline def `setAria-colindextext`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
        
        inline def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
        
        inline def `setAria-colspan`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
        
        inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
        
        inline def `setAria-controls`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
        
        inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
        
        inline def `setAria-current`(value: Signalish[js.UndefOr[Booleanish | page | step | location | date | time]]): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
        
        inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
        
        inline def `setAria-describedby`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
        
        inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
        
        inline def `setAria-description`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
        
        inline def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
        
        inline def `setAria-details`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
        
        inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
        
        inline def `setAria-disabled`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
        
        inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
        
        inline def `setAria-dropeffect`(value: Signalish[js.UndefOr[none | copy | execute | link | move | popup]]): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
        
        inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
        
        inline def `setAria-errormessage`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
        
        inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
        
        inline def `setAria-expanded`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
        
        inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
        
        inline def `setAria-flowto`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
        
        inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
        
        inline def `setAria-grabbed`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
        
        inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
        
        inline def `setAria-haspopup`(value: Signalish[js.UndefOr[Booleanish | menu | listbox | tree | grid | dialog]]): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
        
        inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
        
        inline def `setAria-hidden`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
        
        inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
        
        inline def `setAria-invalid`(value: Signalish[js.UndefOr[Booleanish | grammar | spelling]]): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
        
        inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
        
        inline def `setAria-keyshortcuts`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
        
        inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
        
        inline def `setAria-label`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
        
        inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
        
        inline def `setAria-labelledby`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
        
        inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
        
        inline def `setAria-level`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
        
        inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
        
        inline def `setAria-live`(value: Signalish[js.UndefOr[off | assertive_ | polite_]]): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
        
        inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
        
        inline def `setAria-modal`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
        
        inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
        
        inline def `setAria-multiline`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
        
        inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
        
        inline def `setAria-multiselectable`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
        
        inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
        
        inline def `setAria-orientation`(value: Signalish[js.UndefOr[horizontal | vertical]]): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
        
        inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
        
        inline def `setAria-owns`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
        
        inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
        
        inline def `setAria-placeholder`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
        
        inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
        
        inline def `setAria-posinset`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
        
        inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
        
        inline def `setAria-pressed`(value: Signalish[js.UndefOr[Booleanish | mixed]]): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
        
        inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
        
        inline def `setAria-readonly`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
        
        inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
        
        inline def `setAria-relevant`(
          value: Signalish[
                  js.UndefOr[
                    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
                  ]
                ]
        ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
        
        inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
        
        inline def `setAria-required`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
        
        inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
        
        inline def `setAria-roledescription`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
        
        inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
        
        inline def `setAria-rowcount`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
        
        inline def `setAria-rowindex`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
        
        inline def `setAria-rowindextext`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
        
        inline def `setAria-rowspan`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
        
        inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
        
        inline def `setAria-selected`(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
        
        inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
        
        inline def `setAria-setsize`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
        
        inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
        
        inline def `setAria-sort`(value: Signalish[js.UndefOr[none | ascending | descending | other]]): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
        
        inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
        
        inline def `setAria-valuemax`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
        
        inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
        
        inline def `setAria-valuemin`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
        
        inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
        
        inline def `setAria-valuenow`(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
        
        inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
        
        inline def `setAria-valuetext`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
        
        inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
        
        inline def setAutoCapitalize(value: Signalish[js.UndefOr[off | none | on | sentences | words | characters]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
        
        inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
        
        inline def setAutoCorrect(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        inline def setAutoFocus(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
        
        inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
        
        inline def setChildren(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
        ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChild*
        ): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setClass(value: js.Object | String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        inline def setContentEditable(value: Signalish[js.UndefOr[Booleanish | _empty | `plaintext-only` | inherit]]): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
        
        inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
        
        inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
        
        inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
        
        inline def setDatatype(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
        
        inline def setDir(value: Signalish[js.UndefOr[auto | rtl | ltr]]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        inline def setDisablePictureInPicture(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disablePictureInPicture", value.asInstanceOf[js.Any])
        
        inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
        
        inline def setDraggable(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        inline def setElementTiming(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "elementTiming", value.asInstanceOf[js.Any])
        
        inline def setElementTimingUndefined: Self = StObject.set(x, "elementTiming", js.undefined)
        
        inline def setEnterkeyhint(value: Signalish[js.UndefOr[enter | done | go | next | previous | search | send]]): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
        
        inline def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
        
        inline def setExportparts(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "exportparts", value.asInstanceOf[js.Any])
        
        inline def setExportpartsUndefined: Self = StObject.set(x, "exportparts", js.undefined)
        
        inline def setHidden(value: Signalish[js.UndefOr[Boolean | hidden | `until-found`]]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setId(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInert(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
        
        inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
        
        inline def setInlist(value: Signalish[Any]): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
        
        inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
        
        inline def setInputMode(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
        
        inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
        
        inline def setIs(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
        
        inline def setItemID(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
        
        inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
        
        inline def setItemProp(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
        
        inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
        
        inline def setItemRef(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
        
        inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
        
        inline def setItemScope(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
        
        inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
        
        inline def setItemType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
        
        inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
        
        inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
        
        inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setLang(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
        
        inline def setNonce(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        inline def setOnAbort(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
        
        inline def setOnAbortCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1(value))
        
        inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
        
        inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
        
        inline def setOnAnimationEnd(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
        
        inline def setOnAnimationEndCapture(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
        
        inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
        
        inline def setOnAnimationIteration(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
        
        inline def setOnAnimationIterationCapture(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1(value))
        
        inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
        
        inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
        
        inline def setOnAnimationStart(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
        
        inline def setOnAnimationStartCapture(value: TargetedAnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
        
        inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
        
        inline def setOnBeforeInput(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
        
        inline def setOnBeforeInputCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1(value))
        
        inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
        
        inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
        
        inline def setOnBlur(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
        
        inline def setOnBlurCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1(value))
        
        inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
        
        inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        inline def setOnCanPlay(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
        
        inline def setOnCanPlayThrough(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayThroughCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1(value))
        
        inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
        
        inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
        
        inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
        
        inline def setOnCancel(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
        
        inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
        
        inline def setOnChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        inline def setOnClick(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        
        inline def setOnClickCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1(value))
        
        inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        inline def setOnClose(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
        
        inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        inline def setOnCompositionEnd(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
        
        inline def setOnCompositionEndCapture(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
        
        inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
        
        inline def setOnCompositionStart(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
        
        inline def setOnCompositionStartCapture(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
        
        inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
        
        inline def setOnCompositionUpdate(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
        
        inline def setOnCompositionUpdateCapture(value: TargetedCompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1(value))
        
        inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
        
        inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
        
        inline def setOnContextMenu(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
        
        inline def setOnContextMenuCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1(value))
        
        inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
        
        inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
        
        inline def setOnCopy(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
        
        inline def setOnCopyCapture(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1(value))
        
        inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
        
        inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
        
        inline def setOnCut(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
        
        inline def setOnCutCapture(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1(value))
        
        inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
        
        inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
        
        inline def setOnDblClick(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
        
        inline def setOnDblClickCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onDblClickCapture", js.Any.fromFunction1(value))
        
        inline def setOnDblClickCaptureUndefined: Self = StObject.set(x, "onDblClickCapture", js.undefined)
        
        inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
        
        inline def setOnDrag(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
        
        inline def setOnDragCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
        
        inline def setOnDragEnd(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
        
        inline def setOnDragEndCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
        
        inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
        
        inline def setOnDragEnter(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
        
        inline def setOnDragEnterCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
        
        inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
        
        inline def setOnDragExit(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
        
        inline def setOnDragExitCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
        
        inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
        
        inline def setOnDragLeave(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
        
        inline def setOnDragLeaveCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
        
        inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
        
        inline def setOnDragOver(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
        
        inline def setOnDragOverCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
        
        inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
        
        inline def setOnDragStart(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
        
        inline def setOnDragStartCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
        
        inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
        
        inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
        
        inline def setOnDrop(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
        
        inline def setOnDropCapture(value: TargetedDragEvent[T] => Unit): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1(value))
        
        inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
        
        inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
        
        inline def setOnDurationChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
        
        inline def setOnDurationChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
        
        inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
        
        inline def setOnEmptied(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
        
        inline def setOnEmptiedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1(value))
        
        inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
        
        inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
        
        inline def setOnEncrypted(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
        
        inline def setOnEncryptedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1(value))
        
        inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
        
        inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
        
        inline def setOnEnded(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
        
        inline def setOnEndedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1(value))
        
        inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
        
        inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
        
        inline def setOnEnterPictureInPicture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onEnterPictureInPicture", js.Any.fromFunction1(value))
        
        inline def setOnEnterPictureInPictureCapture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onEnterPictureInPictureCapture", js.Any.fromFunction1(value))
        
        inline def setOnEnterPictureInPictureCaptureUndefined: Self = StObject.set(x, "onEnterPictureInPictureCapture", js.undefined)
        
        inline def setOnEnterPictureInPictureUndefined: Self = StObject.set(x, "onEnterPictureInPicture", js.undefined)
        
        inline def setOnError(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
        
        inline def setOnErrorCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1(value))
        
        inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
        
        inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        inline def setOnFocus(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        inline def setOnFocusCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1(value))
        
        inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
        
        inline def setOnFocusIn(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
        
        inline def setOnFocusInCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusInCapture", js.Any.fromFunction1(value))
        
        inline def setOnFocusInCaptureUndefined: Self = StObject.set(x, "onFocusInCapture", js.undefined)
        
        inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
        
        inline def setOnFocusOut(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
        
        inline def setOnFocusOutCapture(value: TargetedFocusEvent[T] => Unit): Self = StObject.set(x, "onFocusOutCapture", js.Any.fromFunction1(value))
        
        inline def setOnFocusOutCaptureUndefined: Self = StObject.set(x, "onFocusOutCapture", js.undefined)
        
        inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
        
        inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        inline def setOnFormData(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onFormData", js.Any.fromFunction1(value))
        
        inline def setOnFormDataCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onFormDataCapture", js.Any.fromFunction1(value))
        
        inline def setOnFormDataCaptureUndefined: Self = StObject.set(x, "onFormDataCapture", js.undefined)
        
        inline def setOnFormDataUndefined: Self = StObject.set(x, "onFormData", js.undefined)
        
        inline def setOnGotPointerCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1(value))
        
        inline def setOnGotPointerCaptureCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1(value))
        
        inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
        
        inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
        
        inline def setOnInput(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
        
        inline def setOnInputCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedInputEvent[T] => Unit
        ): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1(value))
        
        inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
        
        inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
        
        inline def setOnInvalid(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
        
        inline def setOnInvalidCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1(value))
        
        inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
        
        inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
        
        inline def setOnKeyDown(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
        
        inline def setOnKeyDownCapture(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1(value))
        
        inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
        
        inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
        
        inline def setOnKeyPress(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
        
        inline def setOnKeyPressCapture(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1(value))
        
        inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
        
        inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
        
        inline def setOnKeyUp(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
        
        inline def setOnKeyUpCapture(value: TargetedKeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1(value))
        
        inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
        
        inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
        
        inline def setOnLeavePictureInPicture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onLeavePictureInPicture", js.Any.fromFunction1(value))
        
        inline def setOnLeavePictureInPictureCapture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onLeavePictureInPictureCapture", js.Any.fromFunction1(value))
        
        inline def setOnLeavePictureInPictureCaptureUndefined: Self = StObject.set(x, "onLeavePictureInPictureCapture", js.undefined)
        
        inline def setOnLeavePictureInPictureUndefined: Self = StObject.set(x, "onLeavePictureInPicture", js.undefined)
        
        inline def setOnLoad(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
        
        inline def setOnLoadCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
        
        inline def setOnLoadStart(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
        
        inline def setOnLoadStartCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
        
        inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
        
        inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
        
        inline def setOnLoadedData(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
        
        inline def setOnLoadedDataCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
        
        inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
        
        inline def setOnLoadedMetadata(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
        
        inline def setOnLoadedMetadataCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1(value))
        
        inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
        
        inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
        
        inline def setOnLostPointerCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1(value))
        
        inline def setOnLostPointerCaptureCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1(value))
        
        inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
        
        inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
        
        inline def setOnMouseDown(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
        
        inline def setOnMouseDownCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
        
        inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
        
        inline def setOnMouseEnter(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
        
        inline def setOnMouseEnterCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseEnterCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseEnterCaptureUndefined: Self = StObject.set(x, "onMouseEnterCapture", js.undefined)
        
        inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
        
        inline def setOnMouseLeave(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
        
        inline def setOnMouseLeaveCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseLeaveCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseLeaveCaptureUndefined: Self = StObject.set(x, "onMouseLeaveCapture", js.undefined)
        
        inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
        
        inline def setOnMouseMove(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
        
        inline def setOnMouseMoveCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
        
        inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
        
        inline def setOnMouseOut(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
        
        inline def setOnMouseOutCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
        
        inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
        
        inline def setOnMouseOver(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
        
        inline def setOnMouseOverCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
        
        inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
        
        inline def setOnMouseUp(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
        
        inline def setOnMouseUpCapture(
          value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.TargetedMouseEvent[T] => Unit
        ): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1(value))
        
        inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
        
        inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
        
        inline def setOnPaste(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
        
        inline def setOnPasteCapture(value: TargetedClipboardEvent[T] => Unit): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1(value))
        
        inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
        
        inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
        
        inline def setOnPause(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
        
        inline def setOnPauseCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1(value))
        
        inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
        
        inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
        
        inline def setOnPlay(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
        
        inline def setOnPlayCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1(value))
        
        inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
        
        inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
        
        inline def setOnPlaying(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
        
        inline def setOnPlayingCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1(value))
        
        inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
        
        inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
        
        inline def setOnPointerCancel(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
        
        inline def setOnPointerCancelCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
        
        inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
        
        inline def setOnPointerDown(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
        
        inline def setOnPointerDownCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
        
        inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
        
        inline def setOnPointerEnter(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
        
        inline def setOnPointerEnterCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
        
        inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
        
        inline def setOnPointerLeave(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
        
        inline def setOnPointerLeaveCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
        
        inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
        
        inline def setOnPointerMove(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
        
        inline def setOnPointerMoveCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
        
        inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
        
        inline def setOnPointerOut(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
        
        inline def setOnPointerOutCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
        
        inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
        
        inline def setOnPointerOver(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
        
        inline def setOnPointerOverCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
        
        inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
        
        inline def setOnPointerUp(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
        
        inline def setOnPointerUpCapture(value: TargetedPointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
        
        inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
        
        inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
        
        inline def setOnProgress(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
        
        inline def setOnProgressCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1(value))
        
        inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
        
        inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
        
        inline def setOnRateChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
        
        inline def setOnRateChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
        
        inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
        
        inline def setOnReset(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
        
        inline def setOnResetCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1(value))
        
        inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
        
        inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
        
        inline def setOnResize(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
        
        inline def setOnResizeCapture(value: TargetedPictureInPictureEvent[T] => Unit): Self = StObject.set(x, "onResizeCapture", js.Any.fromFunction1(value))
        
        inline def setOnResizeCaptureUndefined: Self = StObject.set(x, "onResizeCapture", js.undefined)
        
        inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
        
        inline def setOnScroll(value: TargetedUIEvent[T] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
        
        inline def setOnScrollCapture(value: TargetedUIEvent[T] => Unit): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1(value))
        
        inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
        
        inline def setOnScrollEnd(value: TargetedUIEvent[T] => Unit): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction1(value))
        
        inline def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
        
        inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
        
        inline def setOnSearch(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
        
        inline def setOnSearchCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSearchCapture", js.Any.fromFunction1(value))
        
        inline def setOnSearchCaptureUndefined: Self = StObject.set(x, "onSearchCapture", js.undefined)
        
        inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
        
        inline def setOnSeeked(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
        
        inline def setOnSeekedCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1(value))
        
        inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
        
        inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
        
        inline def setOnSeeking(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
        
        inline def setOnSeekingCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1(value))
        
        inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
        
        inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
        
        inline def setOnSelect(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        inline def setOnSelectCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1(value))
        
        inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
        
        inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
        
        inline def setOnStalled(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
        
        inline def setOnStalledCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1(value))
        
        inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
        
        inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
        
        inline def setOnSubmit(value: TargetedSubmitEvent[T] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
        
        inline def setOnSubmitCapture(value: TargetedSubmitEvent[T] => Unit): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1(value))
        
        inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
        
        inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
        
        inline def setOnSuspend(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
        
        inline def setOnSuspendCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1(value))
        
        inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
        
        inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
        
        inline def setOnTimeUpdate(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
        
        inline def setOnTimeUpdateCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1(value))
        
        inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
        
        inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
        
        inline def setOnToggle(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
        
        inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        inline def setOnTouchCancel(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
        
        inline def setOnTouchCancelCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
        
        inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
        
        inline def setOnTouchEnd(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
        
        inline def setOnTouchEndCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
        
        inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
        
        inline def setOnTouchMove(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
        
        inline def setOnTouchMoveCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
        
        inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
        
        inline def setOnTouchStart(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
        
        inline def setOnTouchStartCapture(value: TargetedTouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
        
        inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
        
        inline def setOnTransitionCancel(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionCancel", js.Any.fromFunction1(value))
        
        inline def setOnTransitionCancelCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionCancelCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionCancelCaptureUndefined: Self = StObject.set(x, "onTransitionCancelCapture", js.undefined)
        
        inline def setOnTransitionCancelUndefined: Self = StObject.set(x, "onTransitionCancel", js.undefined)
        
        inline def setOnTransitionEnd(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
        
        inline def setOnTransitionEndCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
        
        inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
        
        inline def setOnTransitionRun(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionRun", js.Any.fromFunction1(value))
        
        inline def setOnTransitionRunCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionRunCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionRunCaptureUndefined: Self = StObject.set(x, "onTransitionRunCapture", js.undefined)
        
        inline def setOnTransitionRunUndefined: Self = StObject.set(x, "onTransitionRun", js.undefined)
        
        inline def setOnTransitionStart(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction1(value))
        
        inline def setOnTransitionStartCapture(value: TargetedTransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionStartCapture", js.Any.fromFunction1(value))
        
        inline def setOnTransitionStartCaptureUndefined: Self = StObject.set(x, "onTransitionStartCapture", js.undefined)
        
        inline def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
        
        inline def setOnVolumeChange(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
        
        inline def setOnVolumeChangeCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1(value))
        
        inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
        
        inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
        
        inline def setOnWaiting(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
        
        inline def setOnWaitingCapture(value: TargetedEvent[T, Event] => Unit): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1(value))
        
        inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
        
        inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
        
        inline def setOnWheel(value: TargetedWheelEvent[T] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
        
        inline def setOnWheelCapture(value: TargetedWheelEvent[T] => Unit): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1(value))
        
        inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
        
        inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
        
        inline def setPart(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
        
        inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
        
        inline def setPopover(value: Signalish[js.UndefOr[auto | hint | manual | Boolean]]): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
        
        inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
        
        inline def setPrefix(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setProperty(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
        
        inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
        
        inline def setRef(value: Ref[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        inline def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
        
        inline def setRefNull: Self = StObject.set(x, "ref", null)
        
        inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
        
        inline def setResource(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setResults(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
        
        inline def setRole(
          value: Signalish[
                  js.UndefOr[
                    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AriaRole
                  ]
                ]
        ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setSlot(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        inline def setSpellcheck(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
        
        inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
        
        inline def setStyle(value: Signalish[js.UndefOr[String | CSSProperties]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setTabIndex(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        inline def setTitle(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTranslate(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
        
        inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
        
        inline def setTypeof(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
        
        inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
        
        inline def setVocab(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
        
        inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      }
    }
    
    type IntrinsicElements = JSXWithClassObj
    
    /* Inlined {[ K in keyof @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module.JSX.IntrinsicElements ]: std.Omit<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module.JSX.IntrinsicElements[K], 'class'> & {  class :object | string | undefined}} */
    trait JSXWithClassObj extends StObject {
      
      var a: OmitAnchorHTMLAttributesH
      
      var abbr: OmitHTMLAttributesHTMLEle
      
      var address: OmitHTMLAttributesHTMLEle
      
      var animate: OmitSVGAttributesSVGAnimaAccentHeight
      
      var animateMotion: OmitSVGAttributesSVGAnima
      
      var animateTransform: OmitSVGAttributesSVGAnimaAbout
      
      var annotation: OmitAnnotationMathMLAttri
      
      var `annotation-xml`: OmitAnnotationXmlMathMLAt
      
      var area: OmitAreaHTMLAttributesHTM
      
      var article: OmitHTMLAttributesHTMLEle
      
      var aside: OmitHTMLAttributesHTMLEle
      
      var audio: OmitAudioHTMLAttributesHT
      
      var b: OmitHTMLAttributesHTMLEle
      
      var base: OmitBaseHTMLAttributesHTM
      
      var bdi: OmitHTMLAttributesHTMLEle
      
      var bdo: OmitHTMLAttributesHTMLEle
      
      var big: OmitHTMLAttributesHTMLEle
      
      var blockquote: OmitBlockquoteHTMLAttribu
      
      var body: OmitHTMLAttributesHTMLBod
      
      var br: OmitHTMLAttributesHTMLBRE
      
      var button: OmitButtonHTMLAttributesH
      
      var canvas: OmitCanvasHTMLAttributesH
      
      var caption: OmitHTMLAttributesHTMLTabAccessKey
      
      var circle: OmitSVGAttributesSVGCircl
      
      var cite: OmitHTMLAttributesHTMLEle
      
      var clipPath: OmitSVGAttributesSVGClipP
      
      var code: OmitHTMLAttributesHTMLEle
      
      var col: OmitColHTMLAttributesHTML
      
      var colgroup: OmitColgroupHTMLAttribute
      
      var data: OmitDataHTMLAttributesHTM
      
      var datalist: OmitHTMLAttributesHTMLDat
      
      var dd: OmitHTMLAttributesHTMLEle
      
      var defs: OmitSVGAttributesSVGDefsE
      
      var del: OmitDelHTMLAttributesHTML
      
      var desc: OmitSVGAttributesSVGDescE
      
      var details: OmitDetailsHTMLAttributes
      
      var dfn: OmitHTMLAttributesHTMLEle
      
      var dialog: OmitDialogHTMLAttributesH
      
      var div: OmitHTMLAttributesHTMLDiv
      
      var dl: OmitHTMLAttributesHTMLDLi
      
      var dt: OmitHTMLAttributesHTMLEle
      
      var ellipse: OmitSVGAttributesSVGEllip
      
      var em: OmitHTMLAttributesHTMLEle
      
      var embed: OmitEmbedHTMLAttributesHT
      
      var feBlend: OmitSVGAttributesSVGFEBle
      
      var feColorMatrix: OmitSVGAttributesSVGFECol
      
      var feComponentTransfer: OmitSVGAttributesSVGFEComAbout
      
      var feComposite: OmitSVGAttributesSVGFECom
      
      var feConvolveMatrix: OmitSVGAttributesSVGFECon
      
      var feDiffuseLighting: OmitSVGAttributesSVGFEDif
      
      var feDisplacementMap: OmitSVGAttributesSVGFEDis
      
      var feDistantLight: OmitSVGAttributesSVGFEDisAbout
      
      var feDropShadow: OmitSVGAttributesSVGFEDro
      
      var feFlood: OmitSVGAttributesSVGFEFlo
      
      var feFuncA: OmitSVGAttributesSVGFEFun
      
      var feFuncB: OmitSVGAttributesSVGFEFunAbout
      
      var feFuncG: OmitSVGAttributesSVGFEFunAccessKey
      
      var feFuncR: OmitSVGAttributesSVGFEFunAccentHeight
      
      var feGaussianBlur: OmitSVGAttributesSVGFEGau
      
      var feImage: OmitSVGAttributesSVGFEIma
      
      var feMerge: OmitSVGAttributesSVGFEMerAbout
      
      var feMergeNode: OmitSVGAttributesSVGFEMer
      
      var feMorphology: OmitSVGAttributesSVGFEMor
      
      var feOffset: OmitSVGAttributesSVGFEOff
      
      var fePointLight: OmitSVGAttributesSVGFEPoi
      
      var feSpecularLighting: OmitSVGAttributesSVGFESpe
      
      var feSpotLight: OmitSVGAttributesSVGFESpo
      
      var feTile: OmitSVGAttributesSVGFETil
      
      var feTurbulence: OmitSVGAttributesSVGFETur
      
      var fieldset: OmitFieldsetHTMLAttribute
      
      var figcaption: OmitHTMLAttributesHTMLEle
      
      var figure: OmitHTMLAttributesHTMLEle
      
      var filter: OmitSVGAttributesSVGFilte
      
      var footer: OmitHTMLAttributesHTMLEle
      
      var foreignObject: OmitSVGAttributesSVGForei
      
      var form: OmitFormHTMLAttributesHTM
      
      var g: OmitSVGAttributesSVGGElem
      
      var h1: OmitHTMLAttributesHTMLHea
      
      var h2: OmitHTMLAttributesHTMLHea
      
      var h3: OmitHTMLAttributesHTMLHea
      
      var h4: OmitHTMLAttributesHTMLHea
      
      var h5: OmitHTMLAttributesHTMLHea
      
      var h6: OmitHTMLAttributesHTMLHea
      
      var head: OmitHTMLAttributesHTMLHeaAbout
      
      var header: OmitHTMLAttributesHTMLEle
      
      var hgroup: OmitHTMLAttributesHTMLEle
      
      var hr: OmitHTMLAttributesHTMLHRE
      
      var html: OmitHTMLAttributesHTMLHtm
      
      var i: OmitHTMLAttributesHTMLEle
      
      var iframe: OmitIframeHTMLAttributesH
      
      var image: OmitSVGAttributesSVGImage
      
      var img: OmitImgHTMLAttributesHTML
      
      var input: OmitInputHTMLAttributesHT
      
      var ins: OmitInsHTMLAttributesHTML
      
      var kbd: OmitHTMLAttributesHTMLEle
      
      var keygen: OmitKeygenHTMLAttributesH
      
      var label: OmitLabelHTMLAttributesHT
      
      var legend: OmitHTMLAttributesHTMLLeg
      
      var li: OmitLiHTMLAttributesHTMLL
      
      var line: OmitSVGAttributesSVGLineE
      
      var linearGradient: OmitSVGAttributesSVGLinea
      
      var link: OmitLinkHTMLAttributesHTM
      
      var maction: OmitMActionMathMLAttribut
      
      var main: OmitHTMLAttributesHTMLEle
      
      var map: OmitMapHTMLAttributesHTML
      
      var mark: OmitHTMLAttributesHTMLEle
      
      var marker: OmitSVGAttributesSVGMarke
      
      var marquee: OmitMarqueeHTMLAttributes
      
      var mask: OmitSVGAttributesSVGMaskE
      
      var math: OmitMathMathMLAttributesM
      
      var menclose: OmitMEncloseMathMLAttribu
      
      var menu: OmitMenuHTMLAttributesHTM
      
      var menuitem: OmitHTMLAttributesHTMLUnk
      
      var merror: OmitMErrorMathMLAttribute
      
      var meta: OmitMetaHTMLAttributesHTM
      
      var metadata: OmitSVGAttributesSVGMetad
      
      var meter: OmitMeterHTMLAttributesHT
      
      var mfenced: OmitMFencedMathMLAttribut
      
      var mfrac: OmitMFracMathMLAttributes
      
      var mi: OmitMiMathMLAttributesMat
      
      var mmultiscripts: OmitMmultiScriptsMathMLAt
      
      var mn: OmitMNMathMLAttributesMat
      
      var mo: OmitMOMathMLAttributesMat
      
      var mover: OmitMOverMathMLAttributes
      
      var mpadded: OmitMPaddedMathMLAttribut
      
      var mpath: OmitSVGAttributesSVGMPath
      
      var mphantom: OmitMPhantomMathMLAttribu
      
      var mprescripts: OmitMPrescriptsMathMLAttr
      
      var mroot: OmitMRootMathMLAttributes
      
      var mrow: OmitMRowMathMLAttributesM
      
      var ms: OmitMSMathMLAttributesMat
      
      var mspace: OmitMSpaceMathMLAttribute
      
      var msqrt: OmitMSqrtMathMLAttributes
      
      var mstyle: OmitMStyleMathMLAttribute
      
      var msub: OmitMSubMathMLAttributesM
      
      var msubsup: OmitMSubsupMathMLAttribut
      
      var msup: OmitMSupMathMLAttributesM
      
      var mtable: OmitMTableMathMLAttribute
      
      var mtd: OmitMTdMathMLAttributesMa
      
      var mtext: OmitMTextMathMLAttributes
      
      var mtr: OmitMTrMathMLAttributesMa
      
      var munder: OmitMUnderMathMLAttribute
      
      var munderover: OmitMUnderMathMLAttribute
      
      var nav: OmitHTMLAttributesHTMLEle
      
      var noscript: OmitHTMLAttributesHTMLEle
      
      var `object`: OmitObjectHTMLAttributesH
      
      var ol: OmitOlHTMLAttributesHTMLO
      
      var optgroup: OmitOptgroupHTMLAttribute
      
      var option: OmitOptionHTMLAttributesH
      
      var output: OmitOutputHTMLAttributesH
      
      var p: OmitHTMLAttributesHTMLPar
      
      var param: OmitParamHTMLAttributesHT
      
      var path: OmitSVGAttributesSVGPathE
      
      var pattern: OmitSVGAttributesSVGPatte
      
      var picture: OmitHTMLAttributesHTMLPic
      
      var polygon: OmitSVGAttributesSVGPolyg
      
      var polyline: OmitSVGAttributesSVGPolyl
      
      var pre: OmitHTMLAttributesHTMLPre
      
      var progress: OmitProgressHTMLAttribute
      
      var q: OmitQuoteHTMLAttributesHT
      
      var radialGradient: OmitSVGAttributesSVGRadia
      
      var rect: OmitSVGAttributesSVGRectE
      
      var rp: OmitHTMLAttributesHTMLEle
      
      var rt: OmitHTMLAttributesHTMLEle
      
      var ruby: OmitHTMLAttributesHTMLEle
      
      var s: OmitHTMLAttributesHTMLEle
      
      var samp: OmitHTMLAttributesHTMLEle
      
      var script: OmitScriptHTMLAttributesH
      
      var search: OmitHTMLAttributesHTMLEle
      
      var section: OmitHTMLAttributesHTMLEle
      
      var select: OmitSelectHTMLAttributesH
      
      var semantics: OmitSemanticsMathMLAttrib
      
      var set: OmitSVGAttributesSVGSetEl
      
      var slot: OmitSlotHTMLAttributesHTM
      
      var small: OmitHTMLAttributesHTMLEle
      
      var source: OmitSourceHTMLAttributesH
      
      var span: OmitHTMLAttributesHTMLSpa
      
      var stop: OmitSVGAttributesSVGStopE
      
      var strong: OmitHTMLAttributesHTMLEle
      
      var style: OmitStyleHTMLAttributesHT
      
      var sub: OmitHTMLAttributesHTMLEle
      
      var summary: OmitHTMLAttributesHTMLEle
      
      var sup: OmitHTMLAttributesHTMLEle
      
      var svg: OmitSVGAttributesSVGSVGEl
      
      var switch: OmitSVGAttributesSVGSwitc
      
      var symbol: OmitSVGAttributesSVGSymbo
      
      var table: OmitTableHTMLAttributesHT
      
      var tbody: OmitHTMLAttributesHTMLTab
      
      var td: OmitTdHTMLAttributesHTMLT
      
      var template: OmitHTMLAttributesHTMLTem
      
      var text: OmitSVGAttributesSVGTextE
      
      var textPath: OmitSVGAttributesSVGTextP
      
      var textarea: OmitTextareaHTMLAttribute
      
      var tfoot: OmitHTMLAttributesHTMLTab
      
      var th: OmitThHTMLAttributesHTMLT
      
      var thead: OmitHTMLAttributesHTMLTab
      
      var time: OmitTimeHTMLAttributesHTM
      
      var title: OmitHTMLAttributesHTMLTit
      
      var tr: OmitHTMLAttributesHTMLTabAbout
      
      var track: OmitTrackHTMLAttributesHT
      
      var tspan: OmitSVGAttributesSVGTSpan
      
      var u: OmitHTMLAttributesHTMLEle
      
      var ul: OmitHTMLAttributesHTMLULi
      
      var use: OmitSVGAttributesSVGUseEl
      
      var `var`: OmitHTMLAttributesHTMLEle
      
      var video: OmitVideoHTMLAttributesHT
      
      var view: OmitSVGAttributesSVGViewE
      
      var wbr: OmitHTMLAttributesHTMLEle
    }
    object JSXWithClassObj {
      
      inline def apply(
        a: OmitAnchorHTMLAttributesH,
        abbr: OmitHTMLAttributesHTMLEle,
        address: OmitHTMLAttributesHTMLEle,
        animate: OmitSVGAttributesSVGAnimaAccentHeight,
        animateMotion: OmitSVGAttributesSVGAnima,
        animateTransform: OmitSVGAttributesSVGAnimaAbout,
        annotation: OmitAnnotationMathMLAttri,
        `annotation-xml`: OmitAnnotationXmlMathMLAt,
        area: OmitAreaHTMLAttributesHTM,
        article: OmitHTMLAttributesHTMLEle,
        aside: OmitHTMLAttributesHTMLEle,
        audio: OmitAudioHTMLAttributesHT,
        b: OmitHTMLAttributesHTMLEle,
        base: OmitBaseHTMLAttributesHTM,
        bdi: OmitHTMLAttributesHTMLEle,
        bdo: OmitHTMLAttributesHTMLEle,
        big: OmitHTMLAttributesHTMLEle,
        blockquote: OmitBlockquoteHTMLAttribu,
        body: OmitHTMLAttributesHTMLBod,
        br: OmitHTMLAttributesHTMLBRE,
        button: OmitButtonHTMLAttributesH,
        canvas: OmitCanvasHTMLAttributesH,
        caption: OmitHTMLAttributesHTMLTabAccessKey,
        circle: OmitSVGAttributesSVGCircl,
        cite: OmitHTMLAttributesHTMLEle,
        clipPath: OmitSVGAttributesSVGClipP,
        code: OmitHTMLAttributesHTMLEle,
        col: OmitColHTMLAttributesHTML,
        colgroup: OmitColgroupHTMLAttribute,
        data: OmitDataHTMLAttributesHTM,
        datalist: OmitHTMLAttributesHTMLDat,
        dd: OmitHTMLAttributesHTMLEle,
        defs: OmitSVGAttributesSVGDefsE,
        del: OmitDelHTMLAttributesHTML,
        desc: OmitSVGAttributesSVGDescE,
        details: OmitDetailsHTMLAttributes,
        dfn: OmitHTMLAttributesHTMLEle,
        dialog: OmitDialogHTMLAttributesH,
        div: OmitHTMLAttributesHTMLDiv,
        dl: OmitHTMLAttributesHTMLDLi,
        dt: OmitHTMLAttributesHTMLEle,
        ellipse: OmitSVGAttributesSVGEllip,
        em: OmitHTMLAttributesHTMLEle,
        embed: OmitEmbedHTMLAttributesHT,
        feBlend: OmitSVGAttributesSVGFEBle,
        feColorMatrix: OmitSVGAttributesSVGFECol,
        feComponentTransfer: OmitSVGAttributesSVGFEComAbout,
        feComposite: OmitSVGAttributesSVGFECom,
        feConvolveMatrix: OmitSVGAttributesSVGFECon,
        feDiffuseLighting: OmitSVGAttributesSVGFEDif,
        feDisplacementMap: OmitSVGAttributesSVGFEDis,
        feDistantLight: OmitSVGAttributesSVGFEDisAbout,
        feDropShadow: OmitSVGAttributesSVGFEDro,
        feFlood: OmitSVGAttributesSVGFEFlo,
        feFuncA: OmitSVGAttributesSVGFEFun,
        feFuncB: OmitSVGAttributesSVGFEFunAbout,
        feFuncG: OmitSVGAttributesSVGFEFunAccessKey,
        feFuncR: OmitSVGAttributesSVGFEFunAccentHeight,
        feGaussianBlur: OmitSVGAttributesSVGFEGau,
        feImage: OmitSVGAttributesSVGFEIma,
        feMerge: OmitSVGAttributesSVGFEMerAbout,
        feMergeNode: OmitSVGAttributesSVGFEMer,
        feMorphology: OmitSVGAttributesSVGFEMor,
        feOffset: OmitSVGAttributesSVGFEOff,
        fePointLight: OmitSVGAttributesSVGFEPoi,
        feSpecularLighting: OmitSVGAttributesSVGFESpe,
        feSpotLight: OmitSVGAttributesSVGFESpo,
        feTile: OmitSVGAttributesSVGFETil,
        feTurbulence: OmitSVGAttributesSVGFETur,
        fieldset: OmitFieldsetHTMLAttribute,
        figcaption: OmitHTMLAttributesHTMLEle,
        figure: OmitHTMLAttributesHTMLEle,
        filter: OmitSVGAttributesSVGFilte,
        footer: OmitHTMLAttributesHTMLEle,
        foreignObject: OmitSVGAttributesSVGForei,
        form: OmitFormHTMLAttributesHTM,
        g: OmitSVGAttributesSVGGElem,
        h1: OmitHTMLAttributesHTMLHea,
        h2: OmitHTMLAttributesHTMLHea,
        h3: OmitHTMLAttributesHTMLHea,
        h4: OmitHTMLAttributesHTMLHea,
        h5: OmitHTMLAttributesHTMLHea,
        h6: OmitHTMLAttributesHTMLHea,
        head: OmitHTMLAttributesHTMLHeaAbout,
        header: OmitHTMLAttributesHTMLEle,
        hgroup: OmitHTMLAttributesHTMLEle,
        hr: OmitHTMLAttributesHTMLHRE,
        html: OmitHTMLAttributesHTMLHtm,
        i: OmitHTMLAttributesHTMLEle,
        iframe: OmitIframeHTMLAttributesH,
        image: OmitSVGAttributesSVGImage,
        img: OmitImgHTMLAttributesHTML,
        input: OmitInputHTMLAttributesHT,
        ins: OmitInsHTMLAttributesHTML,
        kbd: OmitHTMLAttributesHTMLEle,
        keygen: OmitKeygenHTMLAttributesH,
        label: OmitLabelHTMLAttributesHT,
        legend: OmitHTMLAttributesHTMLLeg,
        li: OmitLiHTMLAttributesHTMLL,
        line: OmitSVGAttributesSVGLineE,
        linearGradient: OmitSVGAttributesSVGLinea,
        link: OmitLinkHTMLAttributesHTM,
        maction: OmitMActionMathMLAttribut,
        main: OmitHTMLAttributesHTMLEle,
        map: OmitMapHTMLAttributesHTML,
        mark: OmitHTMLAttributesHTMLEle,
        marker: OmitSVGAttributesSVGMarke,
        marquee: OmitMarqueeHTMLAttributes,
        mask: OmitSVGAttributesSVGMaskE,
        math: OmitMathMathMLAttributesM,
        menclose: OmitMEncloseMathMLAttribu,
        menu: OmitMenuHTMLAttributesHTM,
        menuitem: OmitHTMLAttributesHTMLUnk,
        merror: OmitMErrorMathMLAttribute,
        meta: OmitMetaHTMLAttributesHTM,
        metadata: OmitSVGAttributesSVGMetad,
        meter: OmitMeterHTMLAttributesHT,
        mfenced: OmitMFencedMathMLAttribut,
        mfrac: OmitMFracMathMLAttributes,
        mi: OmitMiMathMLAttributesMat,
        mmultiscripts: OmitMmultiScriptsMathMLAt,
        mn: OmitMNMathMLAttributesMat,
        mo: OmitMOMathMLAttributesMat,
        mover: OmitMOverMathMLAttributes,
        mpadded: OmitMPaddedMathMLAttribut,
        mpath: OmitSVGAttributesSVGMPath,
        mphantom: OmitMPhantomMathMLAttribu,
        mprescripts: OmitMPrescriptsMathMLAttr,
        mroot: OmitMRootMathMLAttributes,
        mrow: OmitMRowMathMLAttributesM,
        ms: OmitMSMathMLAttributesMat,
        mspace: OmitMSpaceMathMLAttribute,
        msqrt: OmitMSqrtMathMLAttributes,
        mstyle: OmitMStyleMathMLAttribute,
        msub: OmitMSubMathMLAttributesM,
        msubsup: OmitMSubsupMathMLAttribut,
        msup: OmitMSupMathMLAttributesM,
        mtable: OmitMTableMathMLAttribute,
        mtd: OmitMTdMathMLAttributesMa,
        mtext: OmitMTextMathMLAttributes,
        mtr: OmitMTrMathMLAttributesMa,
        munder: OmitMUnderMathMLAttribute,
        munderover: OmitMUnderMathMLAttribute,
        nav: OmitHTMLAttributesHTMLEle,
        noscript: OmitHTMLAttributesHTMLEle,
        `object`: OmitObjectHTMLAttributesH,
        ol: OmitOlHTMLAttributesHTMLO,
        optgroup: OmitOptgroupHTMLAttribute,
        option: OmitOptionHTMLAttributesH,
        output: OmitOutputHTMLAttributesH,
        p: OmitHTMLAttributesHTMLPar,
        param: OmitParamHTMLAttributesHT,
        path: OmitSVGAttributesSVGPathE,
        pattern: OmitSVGAttributesSVGPatte,
        picture: OmitHTMLAttributesHTMLPic,
        polygon: OmitSVGAttributesSVGPolyg,
        polyline: OmitSVGAttributesSVGPolyl,
        pre: OmitHTMLAttributesHTMLPre,
        progress: OmitProgressHTMLAttribute,
        q: OmitQuoteHTMLAttributesHT,
        radialGradient: OmitSVGAttributesSVGRadia,
        rect: OmitSVGAttributesSVGRectE,
        rp: OmitHTMLAttributesHTMLEle,
        rt: OmitHTMLAttributesHTMLEle,
        ruby: OmitHTMLAttributesHTMLEle,
        s: OmitHTMLAttributesHTMLEle,
        samp: OmitHTMLAttributesHTMLEle,
        script: OmitScriptHTMLAttributesH,
        search: OmitHTMLAttributesHTMLEle,
        section: OmitHTMLAttributesHTMLEle,
        select: OmitSelectHTMLAttributesH,
        semantics: OmitSemanticsMathMLAttrib,
        set: OmitSVGAttributesSVGSetEl,
        slot: OmitSlotHTMLAttributesHTM,
        small: OmitHTMLAttributesHTMLEle,
        source: OmitSourceHTMLAttributesH,
        span: OmitHTMLAttributesHTMLSpa,
        stop: OmitSVGAttributesSVGStopE,
        strong: OmitHTMLAttributesHTMLEle,
        style: OmitStyleHTMLAttributesHT,
        sub: OmitHTMLAttributesHTMLEle,
        summary: OmitHTMLAttributesHTMLEle,
        sup: OmitHTMLAttributesHTMLEle,
        svg: OmitSVGAttributesSVGSVGEl,
        switch: OmitSVGAttributesSVGSwitc,
        symbol: OmitSVGAttributesSVGSymbo,
        table: OmitTableHTMLAttributesHT,
        tbody: OmitHTMLAttributesHTMLTab,
        td: OmitTdHTMLAttributesHTMLT,
        template: OmitHTMLAttributesHTMLTem,
        text: OmitSVGAttributesSVGTextE,
        textPath: OmitSVGAttributesSVGTextP,
        textarea: OmitTextareaHTMLAttribute,
        tfoot: OmitHTMLAttributesHTMLTab,
        th: OmitThHTMLAttributesHTMLT,
        thead: OmitHTMLAttributesHTMLTab,
        time: OmitTimeHTMLAttributesHTM,
        title: OmitHTMLAttributesHTMLTit,
        tr: OmitHTMLAttributesHTMLTabAbout,
        track: OmitTrackHTMLAttributesHT,
        tspan: OmitSVGAttributesSVGTSpan,
        u: OmitHTMLAttributesHTMLEle,
        ul: OmitHTMLAttributesHTMLULi,
        use: OmitSVGAttributesSVGUseEl,
        `var`: OmitHTMLAttributesHTMLEle,
        video: OmitVideoHTMLAttributesHT,
        view: OmitSVGAttributesSVGViewE,
        wbr: OmitHTMLAttributesHTMLEle
      ): JSXWithClassObj = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], annotation = annotation.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], maction = maction.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], marquee = marquee.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], math = math.asInstanceOf[js.Any], menclose = menclose.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], merror = merror.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mfenced = mfenced.asInstanceOf[js.Any], mfrac = mfrac.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any], mmultiscripts = mmultiscripts.asInstanceOf[js.Any], mn = mn.asInstanceOf[js.Any], mo = mo.asInstanceOf[js.Any], mover = mover.asInstanceOf[js.Any], mpadded = mpadded.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], mphantom = mphantom.asInstanceOf[js.Any], mprescripts = mprescripts.asInstanceOf[js.Any], mroot = mroot.asInstanceOf[js.Any], mrow = mrow.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any], mspace = mspace.asInstanceOf[js.Any], msqrt = msqrt.asInstanceOf[js.Any], mstyle = mstyle.asInstanceOf[js.Any], msub = msub.asInstanceOf[js.Any], msubsup = msubsup.asInstanceOf[js.Any], msup = msup.asInstanceOf[js.Any], mtable = mtable.asInstanceOf[js.Any], mtd = mtd.asInstanceOf[js.Any], mtext = mtext.asInstanceOf[js.Any], mtr = mtr.asInstanceOf[js.Any], munder = munder.asInstanceOf[js.Any], munderover = munderover.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], semantics = semantics.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
        __obj.updateDynamic("annotation-xml")(`annotation-xml`.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
        __obj.asInstanceOf[JSXWithClassObj]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JSXWithClassObj] (val x: Self) extends AnyVal {
        
        inline def setA(value: OmitAnchorHTMLAttributesH): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setAbbr(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        inline def setAddress(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAnimate(value: OmitSVGAttributesSVGAnimaAccentHeight): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        inline def setAnimateMotion(value: OmitSVGAttributesSVGAnima): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
        
        inline def setAnimateTransform(value: OmitSVGAttributesSVGAnimaAbout): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        inline def setAnnotation(value: OmitAnnotationMathMLAttri): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
        
        inline def `setAnnotation-xml`(value: OmitAnnotationXmlMathMLAt): Self = StObject.set(x, "annotation-xml", value.asInstanceOf[js.Any])
        
        inline def setArea(value: OmitAreaHTMLAttributesHTM): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        inline def setArticle(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        inline def setAside(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        inline def setAudio(value: OmitAudioHTMLAttributesHT): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        inline def setB(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setBase(value: OmitBaseHTMLAttributesHTM): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBdi(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        inline def setBdo(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        inline def setBig(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
        
        inline def setBlockquote(value: OmitBlockquoteHTMLAttribu): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        inline def setBody(value: OmitHTMLAttributesHTMLBod): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBr(value: OmitHTMLAttributesHTMLBRE): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        inline def setButton(value: OmitButtonHTMLAttributesH): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setCanvas(value: OmitCanvasHTMLAttributesH): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        inline def setCaption(value: OmitHTMLAttributesHTMLTabAccessKey): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCircle(value: OmitSVGAttributesSVGCircl): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        inline def setCite(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        inline def setClipPath(value: OmitSVGAttributesSVGClipP): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        inline def setCode(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCol(value: OmitColHTMLAttributesHTML): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        inline def setColgroup(value: OmitColgroupHTMLAttribute): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        inline def setData(value: OmitDataHTMLAttributesHTM): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDatalist(value: OmitHTMLAttributesHTMLDat): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        inline def setDd(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        inline def setDefs(value: OmitSVGAttributesSVGDefsE): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        inline def setDel(value: OmitDelHTMLAttributesHTML): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        inline def setDesc(value: OmitSVGAttributesSVGDescE): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: OmitDetailsHTMLAttributes): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDfn(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        inline def setDialog(value: OmitDialogHTMLAttributesH): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        inline def setDiv(value: OmitHTMLAttributesHTMLDiv): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        inline def setDl(value: OmitHTMLAttributesHTMLDLi): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        inline def setDt(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        inline def setEllipse(value: OmitSVGAttributesSVGEllip): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        inline def setEm(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        inline def setEmbed(value: OmitEmbedHTMLAttributesHT): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        inline def setFeBlend(value: OmitSVGAttributesSVGFEBle): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        inline def setFeColorMatrix(value: OmitSVGAttributesSVGFECol): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeComponentTransfer(value: OmitSVGAttributesSVGFEComAbout): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        inline def setFeComposite(value: OmitSVGAttributesSVGFECom): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        inline def setFeConvolveMatrix(value: OmitSVGAttributesSVGFECon): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeDiffuseLighting(value: OmitSVGAttributesSVGFEDif): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        inline def setFeDisplacementMap(value: OmitSVGAttributesSVGFEDis): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        inline def setFeDistantLight(value: OmitSVGAttributesSVGFEDisAbout): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
        
        inline def setFeDropShadow(value: OmitSVGAttributesSVGFEDro): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        inline def setFeFlood(value: OmitSVGAttributesSVGFEFlo): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        inline def setFeFuncA(value: OmitSVGAttributesSVGFEFun): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
        
        inline def setFeFuncB(value: OmitSVGAttributesSVGFEFunAbout): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
        
        inline def setFeFuncG(value: OmitSVGAttributesSVGFEFunAccessKey): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
        
        inline def setFeFuncR(value: OmitSVGAttributesSVGFEFunAccentHeight): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
        
        inline def setFeGaussianBlur(value: OmitSVGAttributesSVGFEGau): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        inline def setFeImage(value: OmitSVGAttributesSVGFEIma): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        inline def setFeMerge(value: OmitSVGAttributesSVGFEMerAbout): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        inline def setFeMergeNode(value: OmitSVGAttributesSVGFEMer): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        inline def setFeMorphology(value: OmitSVGAttributesSVGFEMor): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        inline def setFeOffset(value: OmitSVGAttributesSVGFEOff): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        inline def setFePointLight(value: OmitSVGAttributesSVGFEPoi): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
        
        inline def setFeSpecularLighting(value: OmitSVGAttributesSVGFESpe): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        inline def setFeSpotLight(value: OmitSVGAttributesSVGFESpo): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
        
        inline def setFeTile(value: OmitSVGAttributesSVGFETil): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        inline def setFeTurbulence(value: OmitSVGAttributesSVGFETur): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        inline def setFieldset(value: OmitFieldsetHTMLAttribute): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        inline def setFigcaption(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        inline def setFigure(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        inline def setFilter(value: OmitSVGAttributesSVGFilte): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFooter(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        inline def setForeignObject(value: OmitSVGAttributesSVGForei): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        inline def setForm(value: OmitFormHTMLAttributesHTM): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setG(value: OmitSVGAttributesSVGGElem): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setH1(value: OmitHTMLAttributesHTMLHea): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        inline def setH2(value: OmitHTMLAttributesHTMLHea): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        inline def setH3(value: OmitHTMLAttributesHTMLHea): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        inline def setH4(value: OmitHTMLAttributesHTMLHea): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        inline def setH5(value: OmitHTMLAttributesHTMLHea): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        inline def setH6(value: OmitHTMLAttributesHTMLHea): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        inline def setHead(value: OmitHTMLAttributesHTMLHeaAbout): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        inline def setHeader(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHgroup(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        inline def setHr(value: OmitHTMLAttributesHTMLHRE): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        inline def setHtml(value: OmitHTMLAttributesHTMLHtm): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setI(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        inline def setIframe(value: OmitIframeHTMLAttributesH): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        inline def setImage(value: OmitSVGAttributesSVGImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImg(value: OmitImgHTMLAttributesHTML): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        inline def setInput(value: OmitInputHTMLAttributesHT): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setIns(value: OmitInsHTMLAttributesHTML): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        inline def setKbd(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        inline def setKeygen(value: OmitKeygenHTMLAttributesH): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: OmitLabelHTMLAttributesHT): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLegend(value: OmitHTMLAttributesHTMLLeg): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        inline def setLi(value: OmitLiHTMLAttributesHTMLL): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        inline def setLine(value: OmitSVGAttributesSVGLineE): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setLinearGradient(value: OmitSVGAttributesSVGLinea): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        inline def setLink(value: OmitLinkHTMLAttributesHTM): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setMaction(value: OmitMActionMathMLAttribut): Self = StObject.set(x, "maction", value.asInstanceOf[js.Any])
        
        inline def setMain(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        inline def setMap(value: OmitMapHTMLAttributesHTML): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        inline def setMark(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        inline def setMarker(value: OmitSVGAttributesSVGMarke): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        inline def setMarquee(value: OmitMarqueeHTMLAttributes): Self = StObject.set(x, "marquee", value.asInstanceOf[js.Any])
        
        inline def setMask(value: OmitSVGAttributesSVGMaskE): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        inline def setMath(value: OmitMathMathMLAttributesM): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
        
        inline def setMenclose(value: OmitMEncloseMathMLAttribu): Self = StObject.set(x, "menclose", value.asInstanceOf[js.Any])
        
        inline def setMenu(value: OmitMenuHTMLAttributesHTM): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setMenuitem(value: OmitHTMLAttributesHTMLUnk): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
        
        inline def setMerror(value: OmitMErrorMathMLAttribute): Self = StObject.set(x, "merror", value.asInstanceOf[js.Any])
        
        inline def setMeta(value: OmitMetaHTMLAttributesHTM): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: OmitSVGAttributesSVGMetad): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMeter(value: OmitMeterHTMLAttributesHT): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        inline def setMfenced(value: OmitMFencedMathMLAttribut): Self = StObject.set(x, "mfenced", value.asInstanceOf[js.Any])
        
        inline def setMfrac(value: OmitMFracMathMLAttributes): Self = StObject.set(x, "mfrac", value.asInstanceOf[js.Any])
        
        inline def setMi(value: OmitMiMathMLAttributesMat): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
        
        inline def setMmultiscripts(value: OmitMmultiScriptsMathMLAt): Self = StObject.set(x, "mmultiscripts", value.asInstanceOf[js.Any])
        
        inline def setMn(value: OmitMNMathMLAttributesMat): Self = StObject.set(x, "mn", value.asInstanceOf[js.Any])
        
        inline def setMo(value: OmitMOMathMLAttributesMat): Self = StObject.set(x, "mo", value.asInstanceOf[js.Any])
        
        inline def setMover(value: OmitMOverMathMLAttributes): Self = StObject.set(x, "mover", value.asInstanceOf[js.Any])
        
        inline def setMpadded(value: OmitMPaddedMathMLAttribut): Self = StObject.set(x, "mpadded", value.asInstanceOf[js.Any])
        
        inline def setMpath(value: OmitSVGAttributesSVGMPath): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
        
        inline def setMphantom(value: OmitMPhantomMathMLAttribu): Self = StObject.set(x, "mphantom", value.asInstanceOf[js.Any])
        
        inline def setMprescripts(value: OmitMPrescriptsMathMLAttr): Self = StObject.set(x, "mprescripts", value.asInstanceOf[js.Any])
        
        inline def setMroot(value: OmitMRootMathMLAttributes): Self = StObject.set(x, "mroot", value.asInstanceOf[js.Any])
        
        inline def setMrow(value: OmitMRowMathMLAttributesM): Self = StObject.set(x, "mrow", value.asInstanceOf[js.Any])
        
        inline def setMs(value: OmitMSMathMLAttributesMat): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
        
        inline def setMspace(value: OmitMSpaceMathMLAttribute): Self = StObject.set(x, "mspace", value.asInstanceOf[js.Any])
        
        inline def setMsqrt(value: OmitMSqrtMathMLAttributes): Self = StObject.set(x, "msqrt", value.asInstanceOf[js.Any])
        
        inline def setMstyle(value: OmitMStyleMathMLAttribute): Self = StObject.set(x, "mstyle", value.asInstanceOf[js.Any])
        
        inline def setMsub(value: OmitMSubMathMLAttributesM): Self = StObject.set(x, "msub", value.asInstanceOf[js.Any])
        
        inline def setMsubsup(value: OmitMSubsupMathMLAttribut): Self = StObject.set(x, "msubsup", value.asInstanceOf[js.Any])
        
        inline def setMsup(value: OmitMSupMathMLAttributesM): Self = StObject.set(x, "msup", value.asInstanceOf[js.Any])
        
        inline def setMtable(value: OmitMTableMathMLAttribute): Self = StObject.set(x, "mtable", value.asInstanceOf[js.Any])
        
        inline def setMtd(value: OmitMTdMathMLAttributesMa): Self = StObject.set(x, "mtd", value.asInstanceOf[js.Any])
        
        inline def setMtext(value: OmitMTextMathMLAttributes): Self = StObject.set(x, "mtext", value.asInstanceOf[js.Any])
        
        inline def setMtr(value: OmitMTrMathMLAttributesMa): Self = StObject.set(x, "mtr", value.asInstanceOf[js.Any])
        
        inline def setMunder(value: OmitMUnderMathMLAttribute): Self = StObject.set(x, "munder", value.asInstanceOf[js.Any])
        
        inline def setMunderover(value: OmitMUnderMathMLAttribute): Self = StObject.set(x, "munderover", value.asInstanceOf[js.Any])
        
        inline def setNav(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        inline def setNoscript(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        inline def setObject(value: OmitObjectHTMLAttributesH): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        inline def setOl(value: OmitOlHTMLAttributesHTMLO): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        inline def setOptgroup(value: OmitOptgroupHTMLAttribute): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        inline def setOption(value: OmitOptionHTMLAttributesH): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        inline def setOutput(value: OmitOutputHTMLAttributesH): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setP(value: OmitHTMLAttributesHTMLPar): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        inline def setParam(value: OmitParamHTMLAttributesHT): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
        
        inline def setPath(value: OmitSVGAttributesSVGPathE): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPattern(value: OmitSVGAttributesSVGPatte): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPicture(value: OmitHTMLAttributesHTMLPic): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        inline def setPolygon(value: OmitSVGAttributesSVGPolyg): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        inline def setPolyline(value: OmitSVGAttributesSVGPolyl): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        inline def setPre(value: OmitHTMLAttributesHTMLPre): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        inline def setProgress(value: OmitProgressHTMLAttribute): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setQ(value: OmitQuoteHTMLAttributesHT): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        inline def setRadialGradient(value: OmitSVGAttributesSVGRadia): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        inline def setRect(value: OmitSVGAttributesSVGRectE): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        inline def setRp(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        inline def setRt(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        inline def setRuby(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        inline def setS(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        inline def setSamp(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        inline def setScript(value: OmitScriptHTMLAttributesH): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        inline def setSection(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        inline def setSelect(value: OmitSelectHTMLAttributesH): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        inline def setSemantics(value: OmitSemanticsMathMLAttrib): Self = StObject.set(x, "semantics", value.asInstanceOf[js.Any])
        
        inline def setSet(value: OmitSVGAttributesSVGSetEl): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
        
        inline def setSlot(value: OmitSlotHTMLAttributesHTM): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSmall(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        inline def setSource(value: OmitSourceHTMLAttributesH): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSpan(value: OmitHTMLAttributesHTMLSpa): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setStop(value: OmitSVGAttributesSVGStopE): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        inline def setStrong(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        inline def setStyle(value: OmitStyleHTMLAttributesHT): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setSub(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        inline def setSummary(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSup(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        inline def setSvg(value: OmitSVGAttributesSVGSVGEl): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        inline def setSwitch(value: OmitSVGAttributesSVGSwitc): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        inline def setSymbol(value: OmitSVGAttributesSVGSymbo): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        inline def setTable(value: OmitTableHTMLAttributesHT): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTbody(value: OmitHTMLAttributesHTMLTab): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        inline def setTd(value: OmitTdHTMLAttributesHTMLT): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        inline def setTemplate(value: OmitHTMLAttributesHTMLTem): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setText(value: OmitSVGAttributesSVGTextE): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextPath(value: OmitSVGAttributesSVGTextP): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
        
        inline def setTextarea(value: OmitTextareaHTMLAttribute): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        inline def setTfoot(value: OmitHTMLAttributesHTMLTab): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        inline def setTh(value: OmitThHTMLAttributesHTMLT): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        inline def setThead(value: OmitHTMLAttributesHTMLTab): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        inline def setTime(value: OmitTimeHTMLAttributesHTM): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: OmitHTMLAttributesHTMLTit): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTr(value: OmitHTMLAttributesHTMLTabAbout): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        inline def setTrack(value: OmitTrackHTMLAttributesHT): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        inline def setTspan(value: OmitSVGAttributesSVGTSpan): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        inline def setU(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        inline def setUl(value: OmitHTMLAttributesHTMLULi): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        inline def setUse(value: OmitSVGAttributesSVGUseEl): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        inline def setVar(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        inline def setVideo(value: OmitVideoHTMLAttributesHT): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        inline def setView(value: OmitSVGAttributesSVGViewE): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setWbr(value: OmitHTMLAttributesHTMLEle): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      }
    }
    
    type MouseEventHandler[T /* <: EventTarget */] = io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MouseEventHandler[T]
    
    type SVGAttributes = io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.SVGAttributes[SVGElement]
    
    /* Inlined @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module.JSX.TargetedInputEvent<Target> */
    trait TargetedInputEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: `2`
      
      var BUBBLING_PHASE: `3`
      
      var CAPTURING_PHASE: `1`
      
      var NONE: `0`
      
      var bubbles: Boolean
      
      var cancelBubble: Boolean
      
      var cancelable: Boolean
      
      var composed: Boolean
      
      def composedPath(): js.Array[EventTarget]
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]]
      
      val currentTarget: Target
      
      var data: js.UndefOr[String | Null] = js.undefined
      
      var dataTransfer: js.UndefOr[DataTransfer | Null] = js.undefined
      
      var defaultPrevented: Boolean
      
      var detail: Double
      
      var eventPhase: Double
      
      def getTargetRanges(): js.Array[StaticRange]
      @JSName("getTargetRanges")
      var getTargetRanges_Original: js.Function0[js.Array[StaticRange]]
      
      def initEvent(`type`: String): Unit
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit]
      
      def initUIEvent(typeArg: String): Unit
      @JSName("initUIEvent")
      var initUIEvent_Original: js.Function1[/* typeArg */ String, Unit]
      
      var inputType: String
      
      var isComposing: Boolean
      
      var isTrusted: Boolean
      
      def preventDefault(): Unit
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit]
      
      var returnValue: Boolean
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
      
      def stopImmediatePropagation(): Unit
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit]
      
      def stopPropagation(): Unit
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit]
      
      var target: js.UndefOr[EventTarget | Null] = js.undefined
      
      var timeStamp: DOMHighResTimeStamp
      
      var `type`: String
      
      var view: js.UndefOr[Window | Null] = js.undefined
      
      var which: Double
    }
    object TargetedInputEvent {
      
      inline def apply[Target /* <: EventTarget */](
        bubbles: Boolean,
        cancelBubble: Boolean,
        cancelable: Boolean,
        composed: Boolean,
        composedPath: () => js.Array[EventTarget],
        currentTarget: Target,
        defaultPrevented: Boolean,
        detail: Double,
        eventPhase: Double,
        getTargetRanges: () => js.Array[StaticRange],
        initEvent: /* type */ String => Unit,
        initUIEvent: /* typeArg */ String => Unit,
        inputType: String,
        isComposing: Boolean,
        isTrusted: Boolean,
        preventDefault: () => Unit,
        returnValue: Boolean,
        stopImmediatePropagation: () => Unit,
        stopPropagation: () => Unit,
        timeStamp: DOMHighResTimeStamp,
        `type`: String,
        which: Double
      ): TargetedInputEvent[Target] = {
        val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0, bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getTargetRanges = js.Any.fromFunction0(getTargetRanges), initEvent = js.Any.fromFunction1(initEvent), initUIEvent = js.Any.fromFunction1(initUIEvent), inputType = inputType.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[TargetedInputEvent[Target]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TargetedInputEvent[?], Target /* <: EventTarget */] (val x: Self & TargetedInputEvent[Target]) extends AnyVal {
        
        inline def setAT_TARGET(value: `2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
        
        inline def setBUBBLING_PHASE(value: `3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
        
        inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
        
        inline def setCAPTURING_PHASE(value: `1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
        
        inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
        
        inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
        
        inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
        
        inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
        
        inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataNull: Self = StObject.set(x, "data", null)
        
        inline def setDataTransfer(value: DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
        
        inline def setDataTransferNull: Self = StObject.set(x, "dataTransfer", null)
        
        inline def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
        
        inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
        
        inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
        
        inline def setGetTargetRanges(value: () => js.Array[StaticRange]): Self = StObject.set(x, "getTargetRanges", js.Any.fromFunction0(value))
        
        inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
        
        inline def setInitUIEvent(value: /* typeArg */ String => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction1(value))
        
        inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
        
        inline def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
        
        inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
        
        inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
        
        inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
        
        inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
        
        inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
        
        inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
        
        inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
        
        inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
        
        inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
        
        inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetNull: Self = StObject.set(x, "target", null)
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewNull: Self = StObject.set(x, "view", null)
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
        
        inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module.JSX.TargetedMouseEvent<Target> */
    trait TargetedMouseEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: `2`
      
      var BUBBLING_PHASE: `3`
      
      var CAPTURING_PHASE: `1`
      
      var NONE: `0`
      
      var altKey: Boolean
      
      var bubbles: Boolean
      
      var button: Double
      
      var buttons: Double
      
      var cancelBubble: Boolean
      
      var cancelable: Boolean
      
      var clientX: Double
      
      var clientY: Double
      
      var composed: Boolean
      
      def composedPath(): js.Array[EventTarget]
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]]
      
      var ctrlKey: Boolean
      
      val currentTarget: Target
      
      var defaultPrevented: Boolean
      
      var detail: Double
      
      var eventPhase: Double
      
      def getModifierState(keyArg: String): Boolean
      @JSName("getModifierState")
      var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean]
      
      def initEvent(`type`: String): Unit
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit]
      
      def initMouseEvent(
        typeArg: String,
        canBubbleArg: Boolean,
        cancelableArg: Boolean,
        viewArg: Window,
        detailArg: Double,
        screenXArg: Double,
        screenYArg: Double,
        clientXArg: Double,
        clientYArg: Double,
        ctrlKeyArg: Boolean,
        altKeyArg: Boolean,
        shiftKeyArg: Boolean,
        metaKeyArg: Boolean,
        buttonArg: Double
      ): Unit
      @JSName("initMouseEvent")
      var initMouseEvent_Original: js.Function14[
            /* typeArg */ String, 
            /* canBubbleArg */ Boolean, 
            /* cancelableArg */ Boolean, 
            /* viewArg */ Window, 
            /* detailArg */ Double, 
            /* screenXArg */ Double, 
            /* screenYArg */ Double, 
            /* clientXArg */ Double, 
            /* clientYArg */ Double, 
            /* ctrlKeyArg */ Boolean, 
            /* altKeyArg */ Boolean, 
            /* shiftKeyArg */ Boolean, 
            /* metaKeyArg */ Boolean, 
            /* buttonArg */ Double, 
            Unit
          ]
      
      def initUIEvent(typeArg: String): Unit
      @JSName("initUIEvent")
      var initUIEvent_Original: js.Function1[/* typeArg */ String, Unit]
      
      var isTrusted: Boolean
      
      var layerX: Double
      
      var layerY: Double
      
      var metaKey: Boolean
      
      var movementX: Double
      
      var movementY: Double
      
      var offsetX: Double
      
      var offsetY: Double
      
      var pageX: Double
      
      var pageY: Double
      
      def preventDefault(): Unit
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit]
      
      var relatedTarget: js.UndefOr[EventTarget | Null] = js.undefined
      
      var returnValue: Boolean
      
      var screenX: Double
      
      var screenY: Double
      
      var shiftKey: Boolean
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
      
      def stopImmediatePropagation(): Unit
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit]
      
      def stopPropagation(): Unit
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit]
      
      var target: js.UndefOr[EventTarget | Null] = js.undefined
      
      var timeStamp: DOMHighResTimeStamp
      
      var `type`: String
      
      var view: js.UndefOr[Window | Null] = js.undefined
      
      var which: Double
      
      var x: Double
      
      var y: Double
    }
    object TargetedMouseEvent {
      
      inline def apply[Target /* <: EventTarget */](
        altKey: Boolean,
        bubbles: Boolean,
        button: Double,
        buttons: Double,
        cancelBubble: Boolean,
        cancelable: Boolean,
        clientX: Double,
        clientY: Double,
        composed: Boolean,
        composedPath: () => js.Array[EventTarget],
        ctrlKey: Boolean,
        currentTarget: Target,
        defaultPrevented: Boolean,
        detail: Double,
        eventPhase: Double,
        getModifierState: /* keyArg */ String => Boolean,
        initEvent: /* type */ String => Unit,
        initMouseEvent: (/* typeArg */ String, /* canBubbleArg */ Boolean, /* cancelableArg */ Boolean, /* viewArg */ Window, /* detailArg */ Double, /* screenXArg */ Double, /* screenYArg */ Double, /* clientXArg */ Double, /* clientYArg */ Double, /* ctrlKeyArg */ Boolean, /* altKeyArg */ Boolean, /* shiftKeyArg */ Boolean, /* metaKeyArg */ Boolean, /* buttonArg */ Double) => Unit,
        initUIEvent: /* typeArg */ String => Unit,
        isTrusted: Boolean,
        layerX: Double,
        layerY: Double,
        metaKey: Boolean,
        movementX: Double,
        movementY: Double,
        offsetX: Double,
        offsetY: Double,
        pageX: Double,
        pageY: Double,
        preventDefault: () => Unit,
        returnValue: Boolean,
        screenX: Double,
        screenY: Double,
        shiftKey: Boolean,
        stopImmediatePropagation: () => Unit,
        stopPropagation: () => Unit,
        timeStamp: DOMHighResTimeStamp,
        `type`: String,
        which: Double,
        x: Double,
        y: Double
      ): TargetedMouseEvent[Target] = {
        val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0, altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction1(initEvent), initMouseEvent = js.Any.fromFunction14(initMouseEvent), initUIEvent = js.Any.fromFunction1(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], layerX = layerX.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[TargetedMouseEvent[Target]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TargetedMouseEvent[?], Target /* <: EventTarget */] (val x: Self & TargetedMouseEvent[Target]) extends AnyVal {
        
        inline def setAT_TARGET(value: `2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
        
        inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
        
        inline def setBUBBLING_PHASE(value: `3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
        
        inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
        
        inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setCAPTURING_PHASE(value: `1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
        
        inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
        
        inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
        
        inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
        
        inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
        
        inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
        
        inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
        
        inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
        
        inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
        
        inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
        
        inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
        
        inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
        
        inline def setGetModifierState(value: /* keyArg */ String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
        
        inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
        
        inline def setInitMouseEvent(
          value: (/* typeArg */ String, /* canBubbleArg */ Boolean, /* cancelableArg */ Boolean, /* viewArg */ Window, /* detailArg */ Double, /* screenXArg */ Double, /* screenYArg */ Double, /* clientXArg */ Double, /* clientYArg */ Double, /* ctrlKeyArg */ Boolean, /* altKeyArg */ Boolean, /* shiftKeyArg */ Boolean, /* metaKeyArg */ Boolean, /* buttonArg */ Double) => Unit
        ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction14(value))
        
        inline def setInitUIEvent(value: /* typeArg */ String => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction1(value))
        
        inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
        
        inline def setLayerX(value: Double): Self = StObject.set(x, "layerX", value.asInstanceOf[js.Any])
        
        inline def setLayerY(value: Double): Self = StObject.set(x, "layerY", value.asInstanceOf[js.Any])
        
        inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
        
        inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
        
        inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
        
        inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
        
        inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
        
        inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
        
        inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
        
        inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
        
        inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
        
        inline def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
        
        inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
        
        inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
        
        inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
        
        inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
        
        inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
        
        inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
        
        inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
        
        inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
        
        inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
        
        inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
        
        inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
        
        inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetNull: Self = StObject.set(x, "target", null)
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewNull: Self = StObject.set(x, "view", null)
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
        
        inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Inlined std.Omit<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/preact.module.VNode<T>, 'type' | 'props'> & {  type :string | new (): @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.default & {  template :@ui5/webcomponents-base.@ui5/webcomponents-base/dist/renderer/executeTemplate.TemplateFunction | undefined,   _metadata :@ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5ElementMetadata.default,   renderer :@ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.Renderer, readonly _needsShadowDOM (): boolean, readonly _generateAccessors (): void,   metadata :@ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5ElementMetadata.Metadata,   styles :@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ComponentStylesData, readonly cacheUniqueDependencies (this : typeof UI5Element): void, readonly getUniqueDependencies (this : typeof UI5Element): std.Array<typeof UI5Element>, readonly onDefine (): std.Promise<void>, readonly fetchI18nBundles (): std.Promise<std.Array<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/i18nBundle.default>>, readonly fetchCLDR (): std.Promise<void>,   asyncFinished :boolean,   definePromise :std.Promise<void> | undefined,   i18nBundleStorage :std.Record<string, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/i18nBundle.default>, readonly define (): typeof UI5Element, readonly getMetadata (): @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5ElementMetadata.default},   props :T & {  children :@ui5/webcomponents-base.@ui5/webcomponents-base/dist/jsx-runtime.ComponentChildren}} */
  trait VNode[T] extends StObject {
    
    var endTime: js.UndefOr[Double] = js.undefined
    
    var key: Key
    
    var props: T & Children
    
    var ref: js.UndefOr[Ref[Any] | Null] = js.undefined
    
    var startTime: js.UndefOr[Double] = js.undefined
    
    var `type`: String | (Instantiable0[default] & TypeofUI5Element)
  }
  object VNode {
    
    inline def apply[T](key: Key, props: T & Children, `type`: String | (Instantiable0[default] & TypeofUI5Element)): VNode[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VNode[?], T] (val x: Self & VNode[T]) extends AnyVal {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setProps(value: T & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setType(value: String | (Instantiable0[default] & TypeofUI5Element)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

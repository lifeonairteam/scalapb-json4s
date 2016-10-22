// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package test.test_pb3



@SerialVersionUID(0L)
final case class TestPB3(
    name: String = "",
    intValue: scala.Option[Int] = None,
    longValue: scala.Option[Long] = None,
    unsignedLongValue: scala.Option[Long] = None,
    floatValue: scala.Option[Float] = None,
    doubleValue: scala.Option[Double] = None,
    boolValue: scala.Option[Boolean] = None,
    stringValue: scala.Option[String] = None,
    bytesValue: scala.Option[com.google.protobuf.ByteString] = None,
    birth: scala.Option[com.google.protobuf.timestamp.Timestamp] = None,
    blink: scala.Option[com.google.protobuf.duration.Duration] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[TestPB3] with com.trueaccord.lenses.Updatable[TestPB3] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name) }
      if (intValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_intValue.toBase(intValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_intValue.toBase(intValue.get).serializedSize }
      if (longValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_longValue.toBase(longValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_longValue.toBase(longValue.get).serializedSize }
      if (unsignedLongValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_unsignedLongValue.toBase(unsignedLongValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_unsignedLongValue.toBase(unsignedLongValue.get).serializedSize }
      if (floatValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_floatValue.toBase(floatValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_floatValue.toBase(floatValue.get).serializedSize }
      if (doubleValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_doubleValue.toBase(doubleValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_doubleValue.toBase(doubleValue.get).serializedSize }
      if (boolValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_boolValue.toBase(boolValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_boolValue.toBase(boolValue.get).serializedSize }
      if (stringValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_stringValue.toBase(stringValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_stringValue.toBase(stringValue.get).serializedSize }
      if (bytesValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(test.test_pb3.TestPB3._typemapper_bytesValue.toBase(bytesValue.get).serializedSize) + test.test_pb3.TestPB3._typemapper_bytesValue.toBase(bytesValue.get).serializedSize }
      if (birth.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(birth.get.serializedSize) + birth.get.serializedSize }
      if (blink.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(blink.get.serializedSize) + blink.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      intValue.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_intValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_intValue.toBase(__v).writeTo(_output__)
      };
      longValue.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_longValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_longValue.toBase(__v).writeTo(_output__)
      };
      unsignedLongValue.foreach { __v =>
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_unsignedLongValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_unsignedLongValue.toBase(__v).writeTo(_output__)
      };
      floatValue.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_floatValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_floatValue.toBase(__v).writeTo(_output__)
      };
      doubleValue.foreach { __v =>
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_doubleValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_doubleValue.toBase(__v).writeTo(_output__)
      };
      boolValue.foreach { __v =>
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_boolValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_boolValue.toBase(__v).writeTo(_output__)
      };
      stringValue.foreach { __v =>
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_stringValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_stringValue.toBase(__v).writeTo(_output__)
      };
      bytesValue.foreach { __v =>
        _output__.writeTag(10, 2)
        _output__.writeUInt32NoTag(test.test_pb3.TestPB3._typemapper_bytesValue.toBase(__v).serializedSize)
        test.test_pb3.TestPB3._typemapper_bytesValue.toBase(__v).writeTo(_output__)
      };
      birth.foreach { __v =>
        _output__.writeTag(11, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      blink.foreach { __v =>
        _output__.writeTag(12, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): test.test_pb3.TestPB3 = {
      var __name = this.name
      var __intValue = this.intValue
      var __longValue = this.longValue
      var __unsignedLongValue = this.unsignedLongValue
      var __floatValue = this.floatValue
      var __doubleValue = this.doubleValue
      var __boolValue = this.boolValue
      var __stringValue = this.stringValue
      var __bytesValue = this.bytesValue
      var __birth = this.birth
      var __blink = this.blink
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __intValue = Some(test.test_pb3.TestPB3._typemapper_intValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __intValue.map(test.test_pb3.TestPB3._typemapper_intValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.Int32Value.defaultInstance))))
          case 34 =>
            __longValue = Some(test.test_pb3.TestPB3._typemapper_longValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __longValue.map(test.test_pb3.TestPB3._typemapper_longValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.Int64Value.defaultInstance))))
          case 42 =>
            __unsignedLongValue = Some(test.test_pb3.TestPB3._typemapper_unsignedLongValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __unsignedLongValue.map(test.test_pb3.TestPB3._typemapper_unsignedLongValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.UInt64Value.defaultInstance))))
          case 50 =>
            __floatValue = Some(test.test_pb3.TestPB3._typemapper_floatValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __floatValue.map(test.test_pb3.TestPB3._typemapper_floatValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.FloatValue.defaultInstance))))
          case 58 =>
            __doubleValue = Some(test.test_pb3.TestPB3._typemapper_doubleValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __doubleValue.map(test.test_pb3.TestPB3._typemapper_doubleValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.DoubleValue.defaultInstance))))
          case 66 =>
            __boolValue = Some(test.test_pb3.TestPB3._typemapper_boolValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __boolValue.map(test.test_pb3.TestPB3._typemapper_boolValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.BoolValue.defaultInstance))))
          case 74 =>
            __stringValue = Some(test.test_pb3.TestPB3._typemapper_stringValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __stringValue.map(test.test_pb3.TestPB3._typemapper_stringValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.StringValue.defaultInstance))))
          case 82 =>
            __bytesValue = Some(test.test_pb3.TestPB3._typemapper_bytesValue.toCustom(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __bytesValue.map(test.test_pb3.TestPB3._typemapper_bytesValue.toBase(_)).getOrElse(com.google.protobuf.wrappers.BytesValue.defaultInstance))))
          case 90 =>
            __birth = Some(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __birth.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)))
          case 98 =>
            __blink = Some(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __blink.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      test.test_pb3.TestPB3(
          name = __name,
          intValue = __intValue,
          longValue = __longValue,
          unsignedLongValue = __unsignedLongValue,
          floatValue = __floatValue,
          doubleValue = __doubleValue,
          boolValue = __boolValue,
          stringValue = __stringValue,
          bytesValue = __bytesValue,
          birth = __birth,
          blink = __blink
      )
    }
    def withName(__v: String): TestPB3 = copy(name = __v)
    def getIntValue: Int = intValue.getOrElse(test.test_pb3.TestPB3._typemapper_intValue.toCustom(com.google.protobuf.wrappers.Int32Value.defaultInstance))
    def clearIntValue: TestPB3 = copy(intValue = None)
    def withIntValue(__v: Int): TestPB3 = copy(intValue = Some(__v))
    def getLongValue: Long = longValue.getOrElse(test.test_pb3.TestPB3._typemapper_longValue.toCustom(com.google.protobuf.wrappers.Int64Value.defaultInstance))
    def clearLongValue: TestPB3 = copy(longValue = None)
    def withLongValue(__v: Long): TestPB3 = copy(longValue = Some(__v))
    def getUnsignedLongValue: Long = unsignedLongValue.getOrElse(test.test_pb3.TestPB3._typemapper_unsignedLongValue.toCustom(com.google.protobuf.wrappers.UInt64Value.defaultInstance))
    def clearUnsignedLongValue: TestPB3 = copy(unsignedLongValue = None)
    def withUnsignedLongValue(__v: Long): TestPB3 = copy(unsignedLongValue = Some(__v))
    def getFloatValue: Float = floatValue.getOrElse(test.test_pb3.TestPB3._typemapper_floatValue.toCustom(com.google.protobuf.wrappers.FloatValue.defaultInstance))
    def clearFloatValue: TestPB3 = copy(floatValue = None)
    def withFloatValue(__v: Float): TestPB3 = copy(floatValue = Some(__v))
    def getDoubleValue: Double = doubleValue.getOrElse(test.test_pb3.TestPB3._typemapper_doubleValue.toCustom(com.google.protobuf.wrappers.DoubleValue.defaultInstance))
    def clearDoubleValue: TestPB3 = copy(doubleValue = None)
    def withDoubleValue(__v: Double): TestPB3 = copy(doubleValue = Some(__v))
    def getBoolValue: Boolean = boolValue.getOrElse(test.test_pb3.TestPB3._typemapper_boolValue.toCustom(com.google.protobuf.wrappers.BoolValue.defaultInstance))
    def clearBoolValue: TestPB3 = copy(boolValue = None)
    def withBoolValue(__v: Boolean): TestPB3 = copy(boolValue = Some(__v))
    def getStringValue: String = stringValue.getOrElse(test.test_pb3.TestPB3._typemapper_stringValue.toCustom(com.google.protobuf.wrappers.StringValue.defaultInstance))
    def clearStringValue: TestPB3 = copy(stringValue = None)
    def withStringValue(__v: String): TestPB3 = copy(stringValue = Some(__v))
    def getBytesValue: com.google.protobuf.ByteString = bytesValue.getOrElse(test.test_pb3.TestPB3._typemapper_bytesValue.toCustom(com.google.protobuf.wrappers.BytesValue.defaultInstance))
    def clearBytesValue: TestPB3 = copy(bytesValue = None)
    def withBytesValue(__v: com.google.protobuf.ByteString): TestPB3 = copy(bytesValue = Some(__v))
    def getBirth: com.google.protobuf.timestamp.Timestamp = birth.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
    def clearBirth: TestPB3 = copy(birth = None)
    def withBirth(__v: com.google.protobuf.timestamp.Timestamp): TestPB3 = copy(birth = Some(__v))
    def getBlink: com.google.protobuf.duration.Duration = blink.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)
    def clearBlink: TestPB3 = copy(blink = None)
    def withBlink(__v: com.google.protobuf.duration.Duration): TestPB3 = copy(blink = Some(__v))
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => intValue.map(test.test_pb3.TestPB3._typemapper_intValue.toBase(_)).getOrElse(null)
        case 4 => longValue.map(test.test_pb3.TestPB3._typemapper_longValue.toBase(_)).getOrElse(null)
        case 5 => unsignedLongValue.map(test.test_pb3.TestPB3._typemapper_unsignedLongValue.toBase(_)).getOrElse(null)
        case 6 => floatValue.map(test.test_pb3.TestPB3._typemapper_floatValue.toBase(_)).getOrElse(null)
        case 7 => doubleValue.map(test.test_pb3.TestPB3._typemapper_doubleValue.toBase(_)).getOrElse(null)
        case 8 => boolValue.map(test.test_pb3.TestPB3._typemapper_boolValue.toBase(_)).getOrElse(null)
        case 9 => stringValue.map(test.test_pb3.TestPB3._typemapper_stringValue.toBase(_)).getOrElse(null)
        case 10 => bytesValue.map(test.test_pb3.TestPB3._typemapper_bytesValue.toBase(_)).getOrElse(null)
        case 11 => birth.getOrElse(null)
        case 12 => blink.getOrElse(null)
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = test.test_pb3.TestPB3
}

object TestPB3 extends com.trueaccord.scalapb.GeneratedMessageCompanion[test.test_pb3.TestPB3] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[test.test_pb3.TestPB3] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): test.test_pb3.TestPB3 = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    test.test_pb3.TestPB3(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.Int32Value]].map(test.test_pb3.TestPB3._typemapper_intValue.toCustom(_)),
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.Int64Value]].map(test.test_pb3.TestPB3._typemapper_longValue.toCustom(_)),
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.UInt64Value]].map(test.test_pb3.TestPB3._typemapper_unsignedLongValue.toCustom(_)),
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.FloatValue]].map(test.test_pb3.TestPB3._typemapper_floatValue.toCustom(_)),
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.DoubleValue]].map(test.test_pb3.TestPB3._typemapper_doubleValue.toCustom(_)),
      __fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.BoolValue]].map(test.test_pb3.TestPB3._typemapper_boolValue.toCustom(_)),
      __fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.StringValue]].map(test.test_pb3.TestPB3._typemapper_stringValue.toCustom(_)),
      __fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.BytesValue]].map(test.test_pb3.TestPB3._typemapper_bytesValue.toCustom(_)),
      __fieldsMap.get(__fields.get(9)).asInstanceOf[scala.Option[com.google.protobuf.timestamp.Timestamp]],
      __fieldsMap.get(__fields.get(10)).asInstanceOf[scala.Option[com.google.protobuf.duration.Duration]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = TestPb3Proto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 2 => __out = com.google.protobuf.wrappers.Int32Value
      case 4 => __out = com.google.protobuf.wrappers.Int64Value
      case 5 => __out = com.google.protobuf.wrappers.UInt64Value
      case 6 => __out = com.google.protobuf.wrappers.FloatValue
      case 7 => __out = com.google.protobuf.wrappers.DoubleValue
      case 8 => __out = com.google.protobuf.wrappers.BoolValue
      case 9 => __out = com.google.protobuf.wrappers.StringValue
      case 10 => __out = com.google.protobuf.wrappers.BytesValue
      case 11 => __out = com.google.protobuf.timestamp.Timestamp
      case 12 => __out = com.google.protobuf.duration.Duration
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = test.test_pb3.TestPB3(
  )
  implicit class TestPB3Lens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, test.test_pb3.TestPB3]) extends com.trueaccord.lenses.ObjectLens[UpperPB, test.test_pb3.TestPB3](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def intValue: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getIntValue)((c_, f_) => c_.copy(intValue = Some(f_)))
    def optionalIntValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.intValue)((c_, f_) => c_.copy(intValue = f_))
    def longValue: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.getLongValue)((c_, f_) => c_.copy(longValue = Some(f_)))
    def optionalLongValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Long]] = field(_.longValue)((c_, f_) => c_.copy(longValue = f_))
    def unsignedLongValue: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.getUnsignedLongValue)((c_, f_) => c_.copy(unsignedLongValue = Some(f_)))
    def optionalUnsignedLongValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Long]] = field(_.unsignedLongValue)((c_, f_) => c_.copy(unsignedLongValue = f_))
    def floatValue: com.trueaccord.lenses.Lens[UpperPB, Float] = field(_.getFloatValue)((c_, f_) => c_.copy(floatValue = Some(f_)))
    def optionalFloatValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Float]] = field(_.floatValue)((c_, f_) => c_.copy(floatValue = f_))
    def doubleValue: com.trueaccord.lenses.Lens[UpperPB, Double] = field(_.getDoubleValue)((c_, f_) => c_.copy(doubleValue = Some(f_)))
    def optionalDoubleValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Double]] = field(_.doubleValue)((c_, f_) => c_.copy(doubleValue = f_))
    def boolValue: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getBoolValue)((c_, f_) => c_.copy(boolValue = Some(f_)))
    def optionalBoolValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.boolValue)((c_, f_) => c_.copy(boolValue = f_))
    def stringValue: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getStringValue)((c_, f_) => c_.copy(stringValue = Some(f_)))
    def optionalStringValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.stringValue)((c_, f_) => c_.copy(stringValue = f_))
    def bytesValue: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.ByteString] = field(_.getBytesValue)((c_, f_) => c_.copy(bytesValue = Some(f_)))
    def optionalBytesValue: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.ByteString]] = field(_.bytesValue)((c_, f_) => c_.copy(bytesValue = f_))
    def birth: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getBirth)((c_, f_) => c_.copy(birth = Some(f_)))
    def optionalBirth: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.birth)((c_, f_) => c_.copy(birth = f_))
    def blink: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.duration.Duration] = field(_.getBlink)((c_, f_) => c_.copy(blink = Some(f_)))
    def optionalBlink: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.duration.Duration]] = field(_.blink)((c_, f_) => c_.copy(blink = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val INTVALUE_FIELD_NUMBER = 2
  final val LONGVALUE_FIELD_NUMBER = 4
  final val UNSIGNEDLONGVALUE_FIELD_NUMBER = 5
  final val FLOATVALUE_FIELD_NUMBER = 6
  final val DOUBLEVALUE_FIELD_NUMBER = 7
  final val BOOLVALUE_FIELD_NUMBER = 8
  final val STRINGVALUE_FIELD_NUMBER = 9
  final val BYTESVALUE_FIELD_NUMBER = 10
  final val BIRTH_FIELD_NUMBER = 11
  final val BLINK_FIELD_NUMBER = 12
  @transient
  private val _typemapper_intValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.Int32Value, Int] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.Int32Value, Int]]
  @transient
  private val _typemapper_longValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.Int64Value, Long] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.Int64Value, Long]]
  @transient
  private val _typemapper_unsignedLongValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.UInt64Value, Long] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.UInt64Value, Long]]
  @transient
  private val _typemapper_floatValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.FloatValue, Float] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.FloatValue, Float]]
  @transient
  private val _typemapper_doubleValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.DoubleValue, Double] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.DoubleValue, Double]]
  @transient
  private val _typemapper_boolValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.BoolValue, Boolean] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.BoolValue, Boolean]]
  @transient
  private val _typemapper_stringValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.StringValue, String] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.StringValue, String]]
  @transient
  private val _typemapper_bytesValue: com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.BytesValue, com.google.protobuf.ByteString] = implicitly[com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.BytesValue, com.google.protobuf.ByteString]]
}
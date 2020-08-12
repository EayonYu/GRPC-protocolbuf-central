# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: protocol/common/tsl/method.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from protocol.common.tsl import value_pb2 as protocol_dot_common_dot_tsl_dot_value__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='protocol/common/tsl/method.proto',
  package='protocol.common.tsl',
  syntax='proto2',
  serialized_options=b'\n\031com.tcl.gaia.protocol.tslZ\031tcl.com/gaia/protocol/tsl',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n protocol/common/tsl/method.proto\x12\x13protocol.common.tsl\x1a\x1fprotocol/common/tsl/value.proto\"\xf1\x01\n\tTSLMethod\x12\x10\n\x08\x64\x65viceId\x18\x01 \x02(\t\x12\x14\n\x0cinvocationId\x18\x02 \x02(\t\x12\x34\n\x06status\x18\x03 \x02(\x0e\x32$.protocol.common.tsl.TSLMethodStatus\x12\x38\n\x0binputParams\x18\x04 \x03(\x0b\x32#.protocol.common.tsl.TSLValueObject\x12\x39\n\x0coutputValues\x18\x05 \x03(\x0b\x32#.protocol.common.tsl.TSLValueObject\x12\x11\n\ttimestamp\x18\x06 \x02(\t*\x94\x01\n\x0fTSLMethodStatus\x12\x1d\n\x19TSL_METHOD_STATUS_UNKNOWN\x10\x00\x12\x1f\n\x1bTSL_METHOD_STATUS_DELIVERED\x10\x01\x12!\n\x1dTSL_METHOD_STATUS_UNDELIVERED\x10\x02\x12\x1e\n\x1aTSL_METHOD_STATUS_COMPLETE\x10\x03\x42\x36\n\x19\x63om.tcl.gaia.protocol.tslZ\x19tcl.com/gaia/protocol/tsl'
  ,
  dependencies=[protocol_dot_common_dot_tsl_dot_value__pb2.DESCRIPTOR,])

_TSLMETHODSTATUS = _descriptor.EnumDescriptor(
  name='TSLMethodStatus',
  full_name='protocol.common.tsl.TSLMethodStatus',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TSL_METHOD_STATUS_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TSL_METHOD_STATUS_DELIVERED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TSL_METHOD_STATUS_UNDELIVERED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TSL_METHOD_STATUS_COMPLETE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=335,
  serialized_end=483,
)
_sym_db.RegisterEnumDescriptor(_TSLMETHODSTATUS)

TSLMethodStatus = enum_type_wrapper.EnumTypeWrapper(_TSLMETHODSTATUS)
TSL_METHOD_STATUS_UNKNOWN = 0
TSL_METHOD_STATUS_DELIVERED = 1
TSL_METHOD_STATUS_UNDELIVERED = 2
TSL_METHOD_STATUS_COMPLETE = 3



_TSLMETHOD = _descriptor.Descriptor(
  name='TSLMethod',
  full_name='protocol.common.tsl.TSLMethod',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='deviceId', full_name='protocol.common.tsl.TSLMethod.deviceId', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='invocationId', full_name='protocol.common.tsl.TSLMethod.invocationId', index=1,
      number=2, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='protocol.common.tsl.TSLMethod.status', index=2,
      number=3, type=14, cpp_type=8, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='inputParams', full_name='protocol.common.tsl.TSLMethod.inputParams', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='outputValues', full_name='protocol.common.tsl.TSLMethod.outputValues', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='protocol.common.tsl.TSLMethod.timestamp', index=5,
      number=6, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto2',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=91,
  serialized_end=332,
)

_TSLMETHOD.fields_by_name['status'].enum_type = _TSLMETHODSTATUS
_TSLMETHOD.fields_by_name['inputParams'].message_type = protocol_dot_common_dot_tsl_dot_value__pb2._TSLVALUEOBJECT
_TSLMETHOD.fields_by_name['outputValues'].message_type = protocol_dot_common_dot_tsl_dot_value__pb2._TSLVALUEOBJECT
DESCRIPTOR.message_types_by_name['TSLMethod'] = _TSLMETHOD
DESCRIPTOR.enum_types_by_name['TSLMethodStatus'] = _TSLMETHODSTATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TSLMethod = _reflection.GeneratedProtocolMessageType('TSLMethod', (_message.Message,), {
  'DESCRIPTOR' : _TSLMETHOD,
  '__module__' : 'protocol.common.tsl.method_pb2'
  # @@protoc_insertion_point(class_scope:protocol.common.tsl.TSLMethod)
  })
_sym_db.RegisterMessage(TSLMethod)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)

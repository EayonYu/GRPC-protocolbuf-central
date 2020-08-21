# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: protocol/common/tsl/event.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from protocol.common.tsl import value_pb2 as protocol_dot_common_dot_tsl_dot_value__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='protocol/common/tsl/event.proto',
  package='protocol.common.tsl',
  syntax='proto2',
  serialized_options=b'\n\031com.tcl.gaia.protocol.tslZ\031tcl.com/gaia/protocol/tsl',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1fprotocol/common/tsl/event.proto\x12\x13protocol.common.tsl\x1a\x1fprotocol/common/tsl/value.proto\"h\n\x08TSLEvent\x12\x10\n\x08\x65vent_id\x18\x01 \x02(\t\x12\x37\n\nattributes\x18\x02 \x03(\x0b\x32#.protocol.common.tsl.TSLValueObject\x12\x11\n\ttimestamp\x18\x03 \x02(\tB6\n\x19\x63om.tcl.gaia.protocol.tslZ\x19tcl.com/gaia/protocol/tsl'
  ,
  dependencies=[protocol_dot_common_dot_tsl_dot_value__pb2.DESCRIPTOR,])




_TSLEVENT = _descriptor.Descriptor(
  name='TSLEvent',
  full_name='protocol.common.tsl.TSLEvent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event_id', full_name='protocol.common.tsl.TSLEvent.event_id', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attributes', full_name='protocol.common.tsl.TSLEvent.attributes', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='protocol.common.tsl.TSLEvent.timestamp', index=2,
      number=3, type=9, cpp_type=9, label=2,
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
  serialized_start=89,
  serialized_end=193,
)

_TSLEVENT.fields_by_name['attributes'].message_type = protocol_dot_common_dot_tsl_dot_value__pb2._TSLVALUEOBJECT
DESCRIPTOR.message_types_by_name['TSLEvent'] = _TSLEVENT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TSLEvent = _reflection.GeneratedProtocolMessageType('TSLEvent', (_message.Message,), {
  'DESCRIPTOR' : _TSLEVENT,
  '__module__' : 'protocol.common.tsl.event_pb2'
  # @@protoc_insertion_point(class_scope:protocol.common.tsl.TSLEvent)
  })
_sym_db.RegisterMessage(TSLEvent)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)

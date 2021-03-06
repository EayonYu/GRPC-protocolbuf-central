# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: protocol/common/tsl/capability.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from protocol.common.tsl import property_pb2 as protocol_dot_common_dot_tsl_dot_property__pb2
from protocol.common.tsl import method_pb2 as protocol_dot_common_dot_tsl_dot_method__pb2
from protocol.common.tsl import event_pb2 as protocol_dot_common_dot_tsl_dot_event__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='protocol/common/tsl/capability.proto',
  package='protocol.common.tsl',
  syntax='proto2',
  serialized_options=b'\n\031com.tcl.gaia.protocol.tslZ\031tcl.com/gaia/protocol/tsl',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$protocol/common/tsl/capability.proto\x12\x13protocol.common.tsl\x1a\"protocol/common/tsl/property.proto\x1a protocol/common/tsl/method.proto\x1a\x1fprotocol/common/tsl/event.proto\"\xbc\x01\n\rTSLCapability\x12\x15\n\rcapability_id\x18\x01 \x02(\t\x12\x34\n\nproperties\x18\x02 \x03(\x0b\x32 .protocol.common.tsl.TSLProperty\x12-\n\x06\x65vents\x18\x03 \x03(\x0b\x32\x1d.protocol.common.tsl.TSLEvent\x12/\n\x07methods\x18\x04 \x03(\x0b\x32\x1e.protocol.common.tsl.TSLMethodB6\n\x19\x63om.tcl.gaia.protocol.tslZ\x19tcl.com/gaia/protocol/tsl'
  ,
  dependencies=[protocol_dot_common_dot_tsl_dot_property__pb2.DESCRIPTOR,protocol_dot_common_dot_tsl_dot_method__pb2.DESCRIPTOR,protocol_dot_common_dot_tsl_dot_event__pb2.DESCRIPTOR,])




_TSLCAPABILITY = _descriptor.Descriptor(
  name='TSLCapability',
  full_name='protocol.common.tsl.TSLCapability',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='capability_id', full_name='protocol.common.tsl.TSLCapability.capability_id', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='properties', full_name='protocol.common.tsl.TSLCapability.properties', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='events', full_name='protocol.common.tsl.TSLCapability.events', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='methods', full_name='protocol.common.tsl.TSLCapability.methods', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=165,
  serialized_end=353,
)

_TSLCAPABILITY.fields_by_name['properties'].message_type = protocol_dot_common_dot_tsl_dot_property__pb2._TSLPROPERTY
_TSLCAPABILITY.fields_by_name['events'].message_type = protocol_dot_common_dot_tsl_dot_event__pb2._TSLEVENT
_TSLCAPABILITY.fields_by_name['methods'].message_type = protocol_dot_common_dot_tsl_dot_method__pb2._TSLMETHOD
DESCRIPTOR.message_types_by_name['TSLCapability'] = _TSLCAPABILITY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TSLCapability = _reflection.GeneratedProtocolMessageType('TSLCapability', (_message.Message,), {
  'DESCRIPTOR' : _TSLCAPABILITY,
  '__module__' : 'protocol.common.tsl.capability_pb2'
  # @@protoc_insertion_point(class_scope:protocol.common.tsl.TSLCapability)
  })
_sym_db.RegisterMessage(TSLCapability)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)

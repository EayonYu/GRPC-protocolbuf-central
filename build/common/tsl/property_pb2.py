# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: common/tsl/property.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='common/tsl/property.proto',
  package='common.tsl',
  syntax='proto2',
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x19\x63ommon/tsl/property.proto\x12\ncommon.tsl\x1a\x19google/protobuf/any.proto\"L\n\x12TSLDesiredProperty\x12#\n\x05value\x18\x01 \x02(\x0b\x32\x14.google.protobuf.Any\x12\x11\n\ttimestamp\x18\x02 \x02(\t\"M\n\x13TSLReportedProperty\x12#\n\x05value\x18\x01 \x02(\x0b\x32\x14.google.protobuf.Any\x12\x11\n\ttimestamp\x18\x02 \x02(\t\"\x85\x01\n\x0bTSLProperty\x12\x12\n\npropertyId\x18\x01 \x02(\t\x12/\n\x07\x64\x65sired\x18\x02 \x03(\x0b\x32\x1e.common.tsl.TSLDesiredProperty\x12\x31\n\x08reported\x18\x03 \x03(\x0b\x32\x1f.common.tsl.TSLReportedProperty'
  ,
  dependencies=[google_dot_protobuf_dot_any__pb2.DESCRIPTOR,])




_TSLDESIREDPROPERTY = _descriptor.Descriptor(
  name='TSLDesiredProperty',
  full_name='common.tsl.TSLDesiredProperty',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='common.tsl.TSLDesiredProperty.value', index=0,
      number=1, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='common.tsl.TSLDesiredProperty.timestamp', index=1,
      number=2, type=9, cpp_type=9, label=2,
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
  serialized_start=68,
  serialized_end=144,
)


_TSLREPORTEDPROPERTY = _descriptor.Descriptor(
  name='TSLReportedProperty',
  full_name='common.tsl.TSLReportedProperty',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='common.tsl.TSLReportedProperty.value', index=0,
      number=1, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='common.tsl.TSLReportedProperty.timestamp', index=1,
      number=2, type=9, cpp_type=9, label=2,
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
  serialized_start=146,
  serialized_end=223,
)


_TSLPROPERTY = _descriptor.Descriptor(
  name='TSLProperty',
  full_name='common.tsl.TSLProperty',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='propertyId', full_name='common.tsl.TSLProperty.propertyId', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='desired', full_name='common.tsl.TSLProperty.desired', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reported', full_name='common.tsl.TSLProperty.reported', index=2,
      number=3, type=11, cpp_type=10, label=3,
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
  serialized_start=226,
  serialized_end=359,
)

_TSLDESIREDPROPERTY.fields_by_name['value'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_TSLREPORTEDPROPERTY.fields_by_name['value'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_TSLPROPERTY.fields_by_name['desired'].message_type = _TSLDESIREDPROPERTY
_TSLPROPERTY.fields_by_name['reported'].message_type = _TSLREPORTEDPROPERTY
DESCRIPTOR.message_types_by_name['TSLDesiredProperty'] = _TSLDESIREDPROPERTY
DESCRIPTOR.message_types_by_name['TSLReportedProperty'] = _TSLREPORTEDPROPERTY
DESCRIPTOR.message_types_by_name['TSLProperty'] = _TSLPROPERTY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TSLDesiredProperty = _reflection.GeneratedProtocolMessageType('TSLDesiredProperty', (_message.Message,), {
  'DESCRIPTOR' : _TSLDESIREDPROPERTY,
  '__module__' : 'common.tsl.property_pb2'
  # @@protoc_insertion_point(class_scope:common.tsl.TSLDesiredProperty)
  })
_sym_db.RegisterMessage(TSLDesiredProperty)

TSLReportedProperty = _reflection.GeneratedProtocolMessageType('TSLReportedProperty', (_message.Message,), {
  'DESCRIPTOR' : _TSLREPORTEDPROPERTY,
  '__module__' : 'common.tsl.property_pb2'
  # @@protoc_insertion_point(class_scope:common.tsl.TSLReportedProperty)
  })
_sym_db.RegisterMessage(TSLReportedProperty)

TSLProperty = _reflection.GeneratedProtocolMessageType('TSLProperty', (_message.Message,), {
  'DESCRIPTOR' : _TSLPROPERTY,
  '__module__' : 'common.tsl.property_pb2'
  # @@protoc_insertion_point(class_scope:common.tsl.TSLProperty)
  })
_sym_db.RegisterMessage(TSLProperty)


# @@protoc_insertion_point(module_scope)

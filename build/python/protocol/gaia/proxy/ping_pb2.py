# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: protocol/gaia/proxy/ping.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='protocol/gaia/proxy/ping.proto',
  package='protocol.gaia.proxy',
  syntax='proto2',
  serialized_options=b'\n\033com.tcl.gaia.protocol.proxyZ\033tcl.com/gaia/protocol/proxy',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1eprotocol/gaia/proxy/ping.proto\x12\x13protocol.gaia.proxy\"\r\n\x0bPingRequest\"\x1c\n\x0cPingResponse\x12\x0c\n\x04pong\x18\x01 \x02(\x08\x42:\n\x1b\x63om.tcl.gaia.protocol.proxyZ\x1btcl.com/gaia/protocol/proxy'
)




_PINGREQUEST = _descriptor.Descriptor(
  name='PingRequest',
  full_name='protocol.gaia.proxy.PingRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=55,
  serialized_end=68,
)


_PINGRESPONSE = _descriptor.Descriptor(
  name='PingResponse',
  full_name='protocol.gaia.proxy.PingResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='pong', full_name='protocol.gaia.proxy.PingResponse.pong', index=0,
      number=1, type=8, cpp_type=7, label=2,
      has_default_value=False, default_value=False,
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
  serialized_start=70,
  serialized_end=98,
)

DESCRIPTOR.message_types_by_name['PingRequest'] = _PINGREQUEST
DESCRIPTOR.message_types_by_name['PingResponse'] = _PINGRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PingRequest = _reflection.GeneratedProtocolMessageType('PingRequest', (_message.Message,), {
  'DESCRIPTOR' : _PINGREQUEST,
  '__module__' : 'protocol.gaia.proxy.ping_pb2'
  # @@protoc_insertion_point(class_scope:protocol.gaia.proxy.PingRequest)
  })
_sym_db.RegisterMessage(PingRequest)

PingResponse = _reflection.GeneratedProtocolMessageType('PingResponse', (_message.Message,), {
  'DESCRIPTOR' : _PINGRESPONSE,
  '__module__' : 'protocol.gaia.proxy.ping_pb2'
  # @@protoc_insertion_point(class_scope:protocol.gaia.proxy.PingResponse)
  })
_sym_db.RegisterMessage(PingResponse)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)

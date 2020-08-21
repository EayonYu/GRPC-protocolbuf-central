// Code generated by protoc-gen-go. DO NOT EDIT.
// source: protocol/common/tsl/event.proto

package tsl // import "tcl.com/gaia/protocol/tsl"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

// https://confluence.tclking.com/display/IoT4/Partner+API+Common+Objects#PartnerAPICommonObjects-TSLEvent
type TSLEvent struct {
	EventId              *string           `protobuf:"bytes,1,req,name=event_id,json=eventId" json:"event_id,omitempty"`
	Attributes           []*TSLValueObject `protobuf:"bytes,2,rep,name=attributes" json:"attributes,omitempty"`
	Timestamp            *string           `protobuf:"bytes,3,req,name=timestamp" json:"timestamp,omitempty"`
	XXX_NoUnkeyedLiteral struct{}          `json:"-"`
	XXX_unrecognized     []byte            `json:"-"`
	XXX_sizecache        int32             `json:"-"`
}

func (m *TSLEvent) Reset()         { *m = TSLEvent{} }
func (m *TSLEvent) String() string { return proto.CompactTextString(m) }
func (*TSLEvent) ProtoMessage()    {}
func (*TSLEvent) Descriptor() ([]byte, []int) {
	return fileDescriptor_event_afafdb5e7c6bda4b, []int{0}
}
func (m *TSLEvent) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_TSLEvent.Unmarshal(m, b)
}
func (m *TSLEvent) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_TSLEvent.Marshal(b, m, deterministic)
}
func (dst *TSLEvent) XXX_Merge(src proto.Message) {
	xxx_messageInfo_TSLEvent.Merge(dst, src)
}
func (m *TSLEvent) XXX_Size() int {
	return xxx_messageInfo_TSLEvent.Size(m)
}
func (m *TSLEvent) XXX_DiscardUnknown() {
	xxx_messageInfo_TSLEvent.DiscardUnknown(m)
}

var xxx_messageInfo_TSLEvent proto.InternalMessageInfo

func (m *TSLEvent) GetEventId() string {
	if m != nil && m.EventId != nil {
		return *m.EventId
	}
	return ""
}

func (m *TSLEvent) GetAttributes() []*TSLValueObject {
	if m != nil {
		return m.Attributes
	}
	return nil
}

func (m *TSLEvent) GetTimestamp() string {
	if m != nil && m.Timestamp != nil {
		return *m.Timestamp
	}
	return ""
}

func init() {
	proto.RegisterType((*TSLEvent)(nil), "protocol.common.tsl.TSLEvent")
}

func init() {
	proto.RegisterFile("protocol/common/tsl/event.proto", fileDescriptor_event_afafdb5e7c6bda4b)
}

var fileDescriptor_event_afafdb5e7c6bda4b = []byte{
	// 205 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x92, 0x2f, 0x28, 0xca, 0x2f,
	0xc9, 0x4f, 0xce, 0xcf, 0xd1, 0x4f, 0xce, 0xcf, 0xcd, 0xcd, 0xcf, 0xd3, 0x2f, 0x29, 0xce, 0xd1,
	0x4f, 0x2d, 0x4b, 0xcd, 0x2b, 0xd1, 0x03, 0xcb, 0x08, 0x09, 0xc3, 0x14, 0xe8, 0x41, 0x14, 0xe8,
	0x95, 0x14, 0xe7, 0x48, 0x61, 0xd5, 0x55, 0x96, 0x98, 0x53, 0x9a, 0x0a, 0xd1, 0xa5, 0xd4, 0xc1,
	0xc8, 0xc5, 0x11, 0x12, 0xec, 0xe3, 0x0a, 0x32, 0x48, 0x48, 0x92, 0x8b, 0x03, 0x6c, 0x62, 0x7c,
	0x66, 0x8a, 0x04, 0xa3, 0x02, 0x93, 0x06, 0x67, 0x10, 0x3b, 0x98, 0xef, 0x99, 0x22, 0xe4, 0xcc,
	0xc5, 0x95, 0x58, 0x52, 0x52, 0x94, 0x99, 0x54, 0x5a, 0x92, 0x5a, 0x2c, 0xc1, 0xa4, 0xc0, 0xac,
	0xc1, 0x6d, 0xa4, 0xac, 0x87, 0xc5, 0x4a, 0xbd, 0x90, 0x60, 0x9f, 0x30, 0x90, 0x05, 0xfe, 0x49,
	0x59, 0xa9, 0xc9, 0x25, 0x41, 0x48, 0xda, 0x84, 0x64, 0xb8, 0x38, 0x4b, 0x32, 0x73, 0x53, 0x8b,
	0x4b, 0x12, 0x73, 0x0b, 0x24, 0x98, 0xc1, 0x16, 0x20, 0x04, 0x9c, 0xcc, 0xb8, 0x24, 0x93, 0xf3,
	0x73, 0xf5, 0x4a, 0x92, 0x73, 0xf4, 0xd2, 0x13, 0x33, 0x13, 0x11, 0x86, 0x97, 0x14, 0xe7, 0x44,
	0x49, 0x82, 0x84, 0x93, 0xf3, 0x73, 0xf5, 0x41, 0x52, 0xfa, 0x70, 0x5f, 0x95, 0x14, 0xe7, 0x00,
	0x02, 0x00, 0x00, 0xff, 0xff, 0x7c, 0x82, 0xb7, 0x26, 0x1a, 0x01, 0x00, 0x00,
}

// Code generated by protoc-gen-go. DO NOT EDIT.
// source: protocol/common/tsl/value.proto

package tsl // import "tcl.com/gaia/protocol/tsl"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import any "github.com/golang/protobuf/ptypes/any"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

// https://confluence.tclking.com/display/IoT4/Partner+API+Common+Objects#PartnerAPICommonObjects-TSLValueObject
type TSLValueObject struct {
	Id                   *string  `protobuf:"bytes,1,req,name=id" json:"id,omitempty"`
	Value                *any.Any `protobuf:"bytes,2,req,name=value" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *TSLValueObject) Reset()         { *m = TSLValueObject{} }
func (m *TSLValueObject) String() string { return proto.CompactTextString(m) }
func (*TSLValueObject) ProtoMessage()    {}
func (*TSLValueObject) Descriptor() ([]byte, []int) {
	return fileDescriptor_value_05d3a0aed96da9c4, []int{0}
}
func (m *TSLValueObject) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_TSLValueObject.Unmarshal(m, b)
}
func (m *TSLValueObject) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_TSLValueObject.Marshal(b, m, deterministic)
}
func (dst *TSLValueObject) XXX_Merge(src proto.Message) {
	xxx_messageInfo_TSLValueObject.Merge(dst, src)
}
func (m *TSLValueObject) XXX_Size() int {
	return xxx_messageInfo_TSLValueObject.Size(m)
}
func (m *TSLValueObject) XXX_DiscardUnknown() {
	xxx_messageInfo_TSLValueObject.DiscardUnknown(m)
}

var xxx_messageInfo_TSLValueObject proto.InternalMessageInfo

func (m *TSLValueObject) GetId() string {
	if m != nil && m.Id != nil {
		return *m.Id
	}
	return ""
}

func (m *TSLValueObject) GetValue() *any.Any {
	if m != nil {
		return m.Value
	}
	return nil
}

func init() {
	proto.RegisterType((*TSLValueObject)(nil), "protocol.common.tsl.TSLValueObject")
}

func init() {
	proto.RegisterFile("protocol/common/tsl/value.proto", fileDescriptor_value_05d3a0aed96da9c4)
}

var fileDescriptor_value_05d3a0aed96da9c4 = []byte{
	// 182 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x3c, 0x8f, 0x41, 0xcb, 0x82, 0x40,
	0x10, 0x40, 0xf9, 0x16, 0xbe, 0x43, 0x1b, 0x78, 0xb0, 0x0e, 0xda, 0x25, 0xe9, 0x24, 0x1d, 0x66,
	0xa1, 0x43, 0xf7, 0x3a, 0x0b, 0x81, 0x45, 0x87, 0x6e, 0xeb, 0x6a, 0x62, 0xcc, 0x3a, 0xd1, 0x8e,
	0x81, 0xff, 0x3e, 0x74, 0xd1, 0xeb, 0xbc, 0xc7, 0x9b, 0x19, 0xb9, 0x7d, 0x7f, 0x88, 0xc9, 0x10,
	0x2a, 0x43, 0xd6, 0x52, 0xab, 0xd8, 0xa1, 0xfa, 0x6a, 0xec, 0x2a, 0x18, 0x49, 0xb8, 0x9a, 0x04,
	0xf0, 0x02, 0xb0, 0xc3, 0x4d, 0x5c, 0x13, 0xd5, 0x58, 0xa9, 0x91, 0x15, 0xdd, 0x53, 0xe9, 0xb6,
	0xf7, 0xfe, 0x2e, 0x93, 0xc1, 0xed, 0x9a, 0xdd, 0x87, 0xc2, 0xa5, 0x78, 0x55, 0x86, 0xc3, 0x40,
	0x8a, 0xa6, 0x8c, 0xfe, 0x12, 0x91, 0x2e, 0x72, 0xd1, 0x94, 0xe1, 0x5e, 0xfe, 0x8f, 0x0b, 0x22,
	0x91, 0x88, 0x74, 0x79, 0x58, 0x83, 0x8f, 0xc1, 0x14, 0x83, 0x53, 0xdb, 0xe7, 0x5e, 0x39, 0x1f,
	0x65, 0x6c, 0xc8, 0x02, 0x1b, 0x84, 0x5a, 0x37, 0x1a, 0xe6, 0x63, 0xd8, 0xe1, 0x23, 0x1e, 0xc6,
	0x86, 0xac, 0x1a, 0x90, 0x9a, 0x1f, 0x61, 0x87, 0xbf, 0x00, 0x00, 0x00, 0xff, 0xff, 0x5c, 0x92,
	0x02, 0xd8, 0xd7, 0x00, 0x00, 0x00,
}

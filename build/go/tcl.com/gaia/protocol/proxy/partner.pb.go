// Code generated by protoc-gen-go. DO NOT EDIT.
// source: protocol/gaia/proxy/partner.proto

package proxy // import "tcl.com/gaia/protocol/proxy"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import constant "tcl.com/gaia/protocol/constant"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type Partner struct {
	Uuid                 *string  `protobuf:"bytes,1,req,name=uuid" json:"uuid,omitempty"`
	Name                 *string  `protobuf:"bytes,2,req,name=name" json:"name,omitempty"`
	Type                 *string  `protobuf:"bytes,3,req,name=type" json:"type,omitempty"`
	Endpoint             *string  `protobuf:"bytes,4,req,name=endpoint" json:"endpoint,omitempty"`
	CreateTime           *string  `protobuf:"bytes,5,req,name=createTime" json:"createTime,omitempty"`
	UpdateTime           *string  `protobuf:"bytes,6,req,name=updateTime" json:"updateTime,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Partner) Reset()         { *m = Partner{} }
func (m *Partner) String() string { return proto.CompactTextString(m) }
func (*Partner) ProtoMessage()    {}
func (*Partner) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{0}
}
func (m *Partner) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Partner.Unmarshal(m, b)
}
func (m *Partner) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Partner.Marshal(b, m, deterministic)
}
func (dst *Partner) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Partner.Merge(dst, src)
}
func (m *Partner) XXX_Size() int {
	return xxx_messageInfo_Partner.Size(m)
}
func (m *Partner) XXX_DiscardUnknown() {
	xxx_messageInfo_Partner.DiscardUnknown(m)
}

var xxx_messageInfo_Partner proto.InternalMessageInfo

func (m *Partner) GetUuid() string {
	if m != nil && m.Uuid != nil {
		return *m.Uuid
	}
	return ""
}

func (m *Partner) GetName() string {
	if m != nil && m.Name != nil {
		return *m.Name
	}
	return ""
}

func (m *Partner) GetType() string {
	if m != nil && m.Type != nil {
		return *m.Type
	}
	return ""
}

func (m *Partner) GetEndpoint() string {
	if m != nil && m.Endpoint != nil {
		return *m.Endpoint
	}
	return ""
}

func (m *Partner) GetCreateTime() string {
	if m != nil && m.CreateTime != nil {
		return *m.CreateTime
	}
	return ""
}

func (m *Partner) GetUpdateTime() string {
	if m != nil && m.UpdateTime != nil {
		return *m.UpdateTime
	}
	return ""
}

type PartnerPageData struct {
	Content              []*Partner `protobuf:"bytes,1,rep,name=content" json:"content,omitempty"`
	Paged                *bool      `protobuf:"varint,2,req,name=paged" json:"paged,omitempty"`
	Page                 *int32     `protobuf:"varint,3,req,name=page" json:"page,omitempty"`
	TotalPages           *int32     `protobuf:"varint,4,req,name=totalPages" json:"totalPages,omitempty"`
	Elements             *int32     `protobuf:"varint,5,req,name=elements" json:"elements,omitempty"`
	TotalElements        *int32     `protobuf:"varint,6,req,name=totalElements" json:"totalElements,omitempty"`
	First                *bool      `protobuf:"varint,7,req,name=first" json:"first,omitempty"`
	Last                 *bool      `protobuf:"varint,8,req,name=last" json:"last,omitempty"`
	XXX_NoUnkeyedLiteral struct{}   `json:"-"`
	XXX_unrecognized     []byte     `json:"-"`
	XXX_sizecache        int32      `json:"-"`
}

func (m *PartnerPageData) Reset()         { *m = PartnerPageData{} }
func (m *PartnerPageData) String() string { return proto.CompactTextString(m) }
func (*PartnerPageData) ProtoMessage()    {}
func (*PartnerPageData) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{1}
}
func (m *PartnerPageData) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PartnerPageData.Unmarshal(m, b)
}
func (m *PartnerPageData) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PartnerPageData.Marshal(b, m, deterministic)
}
func (dst *PartnerPageData) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PartnerPageData.Merge(dst, src)
}
func (m *PartnerPageData) XXX_Size() int {
	return xxx_messageInfo_PartnerPageData.Size(m)
}
func (m *PartnerPageData) XXX_DiscardUnknown() {
	xxx_messageInfo_PartnerPageData.DiscardUnknown(m)
}

var xxx_messageInfo_PartnerPageData proto.InternalMessageInfo

func (m *PartnerPageData) GetContent() []*Partner {
	if m != nil {
		return m.Content
	}
	return nil
}

func (m *PartnerPageData) GetPaged() bool {
	if m != nil && m.Paged != nil {
		return *m.Paged
	}
	return false
}

func (m *PartnerPageData) GetPage() int32 {
	if m != nil && m.Page != nil {
		return *m.Page
	}
	return 0
}

func (m *PartnerPageData) GetTotalPages() int32 {
	if m != nil && m.TotalPages != nil {
		return *m.TotalPages
	}
	return 0
}

func (m *PartnerPageData) GetElements() int32 {
	if m != nil && m.Elements != nil {
		return *m.Elements
	}
	return 0
}

func (m *PartnerPageData) GetTotalElements() int32 {
	if m != nil && m.TotalElements != nil {
		return *m.TotalElements
	}
	return 0
}

func (m *PartnerPageData) GetFirst() bool {
	if m != nil && m.First != nil {
		return *m.First
	}
	return false
}

func (m *PartnerPageData) GetLast() bool {
	if m != nil && m.Last != nil {
		return *m.Last
	}
	return false
}

type ListPartnerRequest struct {
	SearchBy             []string `protobuf:"bytes,1,rep,name=searchBy" json:"searchBy,omitempty"`
	SortBy               []string `protobuf:"bytes,2,rep,name=sortBy" json:"sortBy,omitempty"`
	Page                 []int32  `protobuf:"varint,3,rep,name=page" json:"page,omitempty"`
	Size                 []int32  `protobuf:"varint,4,rep,name=size" json:"size,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ListPartnerRequest) Reset()         { *m = ListPartnerRequest{} }
func (m *ListPartnerRequest) String() string { return proto.CompactTextString(m) }
func (*ListPartnerRequest) ProtoMessage()    {}
func (*ListPartnerRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{2}
}
func (m *ListPartnerRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListPartnerRequest.Unmarshal(m, b)
}
func (m *ListPartnerRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListPartnerRequest.Marshal(b, m, deterministic)
}
func (dst *ListPartnerRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListPartnerRequest.Merge(dst, src)
}
func (m *ListPartnerRequest) XXX_Size() int {
	return xxx_messageInfo_ListPartnerRequest.Size(m)
}
func (m *ListPartnerRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ListPartnerRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ListPartnerRequest proto.InternalMessageInfo

func (m *ListPartnerRequest) GetSearchBy() []string {
	if m != nil {
		return m.SearchBy
	}
	return nil
}

func (m *ListPartnerRequest) GetSortBy() []string {
	if m != nil {
		return m.SortBy
	}
	return nil
}

func (m *ListPartnerRequest) GetPage() []int32 {
	if m != nil {
		return m.Page
	}
	return nil
}

func (m *ListPartnerRequest) GetSize() []int32 {
	if m != nil {
		return m.Size
	}
	return nil
}

type ListPartnerResponse struct {
	Code                 *int32           `protobuf:"varint,1,req,name=code" json:"code,omitempty"`
	Message              *string          `protobuf:"bytes,2,req,name=message" json:"message,omitempty"`
	Data                 *PartnerPageData `protobuf:"bytes,3,req,name=data" json:"data,omitempty"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-"`
	XXX_unrecognized     []byte           `json:"-"`
	XXX_sizecache        int32            `json:"-"`
}

func (m *ListPartnerResponse) Reset()         { *m = ListPartnerResponse{} }
func (m *ListPartnerResponse) String() string { return proto.CompactTextString(m) }
func (*ListPartnerResponse) ProtoMessage()    {}
func (*ListPartnerResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{3}
}
func (m *ListPartnerResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListPartnerResponse.Unmarshal(m, b)
}
func (m *ListPartnerResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListPartnerResponse.Marshal(b, m, deterministic)
}
func (dst *ListPartnerResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListPartnerResponse.Merge(dst, src)
}
func (m *ListPartnerResponse) XXX_Size() int {
	return xxx_messageInfo_ListPartnerResponse.Size(m)
}
func (m *ListPartnerResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ListPartnerResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ListPartnerResponse proto.InternalMessageInfo

func (m *ListPartnerResponse) GetCode() int32 {
	if m != nil && m.Code != nil {
		return *m.Code
	}
	return 0
}

func (m *ListPartnerResponse) GetMessage() string {
	if m != nil && m.Message != nil {
		return *m.Message
	}
	return ""
}

func (m *ListPartnerResponse) GetData() *PartnerPageData {
	if m != nil {
		return m.Data
	}
	return nil
}

type GetPartnerRequest struct {
	PartnerId            *string  `protobuf:"bytes,1,req,name=partner_id,json=partnerId" json:"partner_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetPartnerRequest) Reset()         { *m = GetPartnerRequest{} }
func (m *GetPartnerRequest) String() string { return proto.CompactTextString(m) }
func (*GetPartnerRequest) ProtoMessage()    {}
func (*GetPartnerRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{4}
}
func (m *GetPartnerRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetPartnerRequest.Unmarshal(m, b)
}
func (m *GetPartnerRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetPartnerRequest.Marshal(b, m, deterministic)
}
func (dst *GetPartnerRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPartnerRequest.Merge(dst, src)
}
func (m *GetPartnerRequest) XXX_Size() int {
	return xxx_messageInfo_GetPartnerRequest.Size(m)
}
func (m *GetPartnerRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPartnerRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetPartnerRequest proto.InternalMessageInfo

func (m *GetPartnerRequest) GetPartnerId() string {
	if m != nil && m.PartnerId != nil {
		return *m.PartnerId
	}
	return ""
}

type GetPartnerResponse struct {
	Code                 *int32   `protobuf:"varint,1,req,name=code" json:"code,omitempty"`
	Message              *string  `protobuf:"bytes,2,req,name=message" json:"message,omitempty"`
	Data                 *Partner `protobuf:"bytes,3,req,name=data" json:"data,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetPartnerResponse) Reset()         { *m = GetPartnerResponse{} }
func (m *GetPartnerResponse) String() string { return proto.CompactTextString(m) }
func (*GetPartnerResponse) ProtoMessage()    {}
func (*GetPartnerResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{5}
}
func (m *GetPartnerResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetPartnerResponse.Unmarshal(m, b)
}
func (m *GetPartnerResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetPartnerResponse.Marshal(b, m, deterministic)
}
func (dst *GetPartnerResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPartnerResponse.Merge(dst, src)
}
func (m *GetPartnerResponse) XXX_Size() int {
	return xxx_messageInfo_GetPartnerResponse.Size(m)
}
func (m *GetPartnerResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPartnerResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetPartnerResponse proto.InternalMessageInfo

func (m *GetPartnerResponse) GetCode() int32 {
	if m != nil && m.Code != nil {
		return *m.Code
	}
	return 0
}

func (m *GetPartnerResponse) GetMessage() string {
	if m != nil && m.Message != nil {
		return *m.Message
	}
	return ""
}

func (m *GetPartnerResponse) GetData() *Partner {
	if m != nil {
		return m.Data
	}
	return nil
}

type AddPartnerRequestPayload struct {
	Name                 *string  `protobuf:"bytes,1,req,name=name" json:"name,omitempty"`
	Endpoint             *string  `protobuf:"bytes,2,req,name=endpoint" json:"endpoint,omitempty"`
	Type                 *string  `protobuf:"bytes,3,req,name=type" json:"type,omitempty"`
	OAuth2Endpoint       *string  `protobuf:"bytes,4,req,name=oAuth2Endpoint" json:"oAuth2Endpoint,omitempty"`
	ClientId             *string  `protobuf:"bytes,5,req,name=clientId" json:"clientId,omitempty"`
	ClientSecret         *string  `protobuf:"bytes,6,req,name=clientSecret" json:"clientSecret,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *AddPartnerRequestPayload) Reset()         { *m = AddPartnerRequestPayload{} }
func (m *AddPartnerRequestPayload) String() string { return proto.CompactTextString(m) }
func (*AddPartnerRequestPayload) ProtoMessage()    {}
func (*AddPartnerRequestPayload) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{6}
}
func (m *AddPartnerRequestPayload) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AddPartnerRequestPayload.Unmarshal(m, b)
}
func (m *AddPartnerRequestPayload) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AddPartnerRequestPayload.Marshal(b, m, deterministic)
}
func (dst *AddPartnerRequestPayload) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AddPartnerRequestPayload.Merge(dst, src)
}
func (m *AddPartnerRequestPayload) XXX_Size() int {
	return xxx_messageInfo_AddPartnerRequestPayload.Size(m)
}
func (m *AddPartnerRequestPayload) XXX_DiscardUnknown() {
	xxx_messageInfo_AddPartnerRequestPayload.DiscardUnknown(m)
}

var xxx_messageInfo_AddPartnerRequestPayload proto.InternalMessageInfo

func (m *AddPartnerRequestPayload) GetName() string {
	if m != nil && m.Name != nil {
		return *m.Name
	}
	return ""
}

func (m *AddPartnerRequestPayload) GetEndpoint() string {
	if m != nil && m.Endpoint != nil {
		return *m.Endpoint
	}
	return ""
}

func (m *AddPartnerRequestPayload) GetType() string {
	if m != nil && m.Type != nil {
		return *m.Type
	}
	return ""
}

func (m *AddPartnerRequestPayload) GetOAuth2Endpoint() string {
	if m != nil && m.OAuth2Endpoint != nil {
		return *m.OAuth2Endpoint
	}
	return ""
}

func (m *AddPartnerRequestPayload) GetClientId() string {
	if m != nil && m.ClientId != nil {
		return *m.ClientId
	}
	return ""
}

func (m *AddPartnerRequestPayload) GetClientSecret() string {
	if m != nil && m.ClientSecret != nil {
		return *m.ClientSecret
	}
	return ""
}

type AddPartnerRequest struct {
	Header               *constant.RequestHeader   `protobuf:"bytes,1,opt,name=header" json:"header,omitempty"`
	Payload              *AddPartnerRequestPayload `protobuf:"bytes,2,req,name=payload" json:"payload,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                  `json:"-"`
	XXX_unrecognized     []byte                    `json:"-"`
	XXX_sizecache        int32                     `json:"-"`
}

func (m *AddPartnerRequest) Reset()         { *m = AddPartnerRequest{} }
func (m *AddPartnerRequest) String() string { return proto.CompactTextString(m) }
func (*AddPartnerRequest) ProtoMessage()    {}
func (*AddPartnerRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{7}
}
func (m *AddPartnerRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AddPartnerRequest.Unmarshal(m, b)
}
func (m *AddPartnerRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AddPartnerRequest.Marshal(b, m, deterministic)
}
func (dst *AddPartnerRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AddPartnerRequest.Merge(dst, src)
}
func (m *AddPartnerRequest) XXX_Size() int {
	return xxx_messageInfo_AddPartnerRequest.Size(m)
}
func (m *AddPartnerRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_AddPartnerRequest.DiscardUnknown(m)
}

var xxx_messageInfo_AddPartnerRequest proto.InternalMessageInfo

func (m *AddPartnerRequest) GetHeader() *constant.RequestHeader {
	if m != nil {
		return m.Header
	}
	return nil
}

func (m *AddPartnerRequest) GetPayload() *AddPartnerRequestPayload {
	if m != nil {
		return m.Payload
	}
	return nil
}

type AddPartnerResponse struct {
	Header               *constant.ResponseHeader `protobuf:"bytes,1,req,name=header" json:"header,omitempty"`
	Payload              *Partner                 `protobuf:"bytes,2,opt,name=payload" json:"payload,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                 `json:"-"`
	XXX_unrecognized     []byte                   `json:"-"`
	XXX_sizecache        int32                    `json:"-"`
}

func (m *AddPartnerResponse) Reset()         { *m = AddPartnerResponse{} }
func (m *AddPartnerResponse) String() string { return proto.CompactTextString(m) }
func (*AddPartnerResponse) ProtoMessage()    {}
func (*AddPartnerResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_partner_c6b4271f1007f269, []int{8}
}
func (m *AddPartnerResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AddPartnerResponse.Unmarshal(m, b)
}
func (m *AddPartnerResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AddPartnerResponse.Marshal(b, m, deterministic)
}
func (dst *AddPartnerResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AddPartnerResponse.Merge(dst, src)
}
func (m *AddPartnerResponse) XXX_Size() int {
	return xxx_messageInfo_AddPartnerResponse.Size(m)
}
func (m *AddPartnerResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_AddPartnerResponse.DiscardUnknown(m)
}

var xxx_messageInfo_AddPartnerResponse proto.InternalMessageInfo

func (m *AddPartnerResponse) GetHeader() *constant.ResponseHeader {
	if m != nil {
		return m.Header
	}
	return nil
}

func (m *AddPartnerResponse) GetPayload() *Partner {
	if m != nil {
		return m.Payload
	}
	return nil
}

func init() {
	proto.RegisterType((*Partner)(nil), "protocol.gaia.proxy.Partner")
	proto.RegisterType((*PartnerPageData)(nil), "protocol.gaia.proxy.PartnerPageData")
	proto.RegisterType((*ListPartnerRequest)(nil), "protocol.gaia.proxy.ListPartnerRequest")
	proto.RegisterType((*ListPartnerResponse)(nil), "protocol.gaia.proxy.ListPartnerResponse")
	proto.RegisterType((*GetPartnerRequest)(nil), "protocol.gaia.proxy.GetPartnerRequest")
	proto.RegisterType((*GetPartnerResponse)(nil), "protocol.gaia.proxy.GetPartnerResponse")
	proto.RegisterType((*AddPartnerRequestPayload)(nil), "protocol.gaia.proxy.AddPartnerRequestPayload")
	proto.RegisterType((*AddPartnerRequest)(nil), "protocol.gaia.proxy.AddPartnerRequest")
	proto.RegisterType((*AddPartnerResponse)(nil), "protocol.gaia.proxy.AddPartnerResponse")
}

func init() {
	proto.RegisterFile("protocol/gaia/proxy/partner.proto", fileDescriptor_partner_c6b4271f1007f269)
}

var fileDescriptor_partner_c6b4271f1007f269 = []byte{
	// 635 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x9c, 0x54, 0xcd, 0x6e, 0xd3, 0x40,
	0x10, 0x96, 0xd3, 0xfc, 0xb4, 0x13, 0x7e, 0xd4, 0x2d, 0x42, 0xab, 0x16, 0x50, 0xb1, 0xaa, 0x36,
	0x17, 0x1c, 0x94, 0x43, 0x85, 0xb8, 0x40, 0x2b, 0xaa, 0x52, 0x89, 0x43, 0x65, 0x38, 0x71, 0x41,
	0x2b, 0x7b, 0x68, 0x2d, 0xc5, 0xbb, 0xc6, 0x3b, 0x91, 0x08, 0x12, 0xaf, 0xc0, 0x1b, 0x70, 0xe0,
	0x65, 0x78, 0x2d, 0xd0, 0xce, 0xda, 0x8e, 0x13, 0x4a, 0x90, 0xb8, 0xcd, 0x7c, 0xf3, 0x8d, 0xfd,
	0x7d, 0xb3, 0x3b, 0x0b, 0x8f, 0x8b, 0xd2, 0x90, 0x49, 0xcc, 0x74, 0x7c, 0xa5, 0x32, 0x35, 0x2e,
	0x4a, 0xf3, 0x79, 0x3e, 0x2e, 0x54, 0x49, 0x1a, 0xcb, 0x88, 0x6b, 0x62, 0xa7, 0xa6, 0x44, 0x8e,
	0x12, 0x31, 0x65, 0xf7, 0xb0, 0xe9, 0x4b, 0x4c, 0x9e, 0x1b, 0x3d, 0x4e, 0x8c, 0xb6, 0xa4, 0x34,
	0x8d, 0x4b, 0xfc, 0x34, 0x43, 0x4b, 0xbe, 0x79, 0xf7, 0x68, 0x0d, 0xcf, 0x16, 0x46, 0x5b, 0xf4,
	0xc4, 0xf0, 0x47, 0x00, 0x83, 0x4b, 0xff, 0x5f, 0x21, 0xa0, 0x3b, 0x9b, 0x65, 0xa9, 0x0c, 0xf6,
	0x3b, 0xa3, 0xad, 0x98, 0x63, 0x87, 0x69, 0x95, 0xa3, 0xec, 0x78, 0xcc, 0xc5, 0x0e, 0xa3, 0x79,
	0x81, 0x72, 0xc3, 0x63, 0x2e, 0x16, 0xbb, 0xb0, 0x89, 0x3a, 0x2d, 0x4c, 0xa6, 0x49, 0x76, 0x19,
	0x6f, 0x72, 0xf1, 0x08, 0x20, 0x29, 0x51, 0x11, 0xbe, 0xcb, 0x72, 0x94, 0x3d, 0xae, 0xb6, 0x10,
	0x57, 0x9f, 0x15, 0x69, 0x5d, 0xef, 0xfb, 0xfa, 0x02, 0x09, 0x7f, 0x05, 0x70, 0xb7, 0xd2, 0x78,
	0xa9, 0xae, 0xf0, 0x95, 0x22, 0x25, 0x8e, 0x61, 0x90, 0x18, 0x4d, 0xa8, 0x49, 0x06, 0xfb, 0x1b,
	0xa3, 0xe1, 0xe4, 0x41, 0x74, 0xc3, 0xbc, 0xa2, 0xaa, 0x2d, 0xae, 0xc9, 0xe2, 0x1e, 0xf4, 0x0a,
	0x75, 0x85, 0x29, 0x1b, 0xda, 0x8c, 0x7d, 0xe2, 0x1c, 0xb9, 0x80, 0x1d, 0xf5, 0x62, 0x8e, 0x9d,
	0x2a, 0x32, 0xa4, 0xa6, 0xee, 0x97, 0x96, 0x3d, 0xf5, 0xe2, 0x16, 0xc2, 0x8e, 0xa7, 0x98, 0xa3,
	0x26, 0xcb, 0x9e, 0x7a, 0x71, 0x93, 0x8b, 0x03, 0xb8, 0xcd, 0xcc, 0xb3, 0x9a, 0xd0, 0x67, 0xc2,
	0x32, 0xe8, 0xb4, 0x7c, 0xcc, 0x4a, 0x4b, 0x72, 0xe0, 0xb5, 0x70, 0xe2, 0xb4, 0x4c, 0x95, 0x25,
	0xb9, 0xc9, 0x20, 0xc7, 0x61, 0x01, 0xe2, 0x4d, 0x66, 0xa9, 0x76, 0xe3, 0x8f, 0xda, 0x29, 0xb0,
	0xa8, 0xca, 0xe4, 0xfa, 0x74, 0xce, 0x43, 0xd8, 0x8a, 0x9b, 0x5c, 0xdc, 0x87, 0xbe, 0x35, 0x25,
	0x9d, 0xce, 0x65, 0x87, 0x2b, 0x55, 0xd6, 0x72, 0xba, 0xd1, 0x38, 0x15, 0xd0, 0xb5, 0xd9, 0x17,
	0x94, 0x5d, 0x8f, 0xb9, 0x38, 0xfc, 0x0a, 0x3b, 0x4b, 0x7f, 0xf4, 0x97, 0xc6, 0x51, 0x13, 0x93,
	0x22, 0x5f, 0x91, 0x5e, 0xcc, 0xb1, 0x90, 0x30, 0xc8, 0xd1, 0x5a, 0xf7, 0x55, 0x7f, 0x4b, 0xea,
	0x54, 0x3c, 0x83, 0x6e, 0xaa, 0x48, 0xf1, 0x58, 0x87, 0x93, 0x83, 0x75, 0x27, 0x54, 0x1f, 0x6c,
	0xcc, 0x1d, 0xe1, 0x04, 0xb6, 0xcf, 0x71, 0xd5, 0xef, 0x43, 0x80, 0x6a, 0x45, 0x3e, 0x34, 0xb7,
	0x74, 0xab, 0x42, 0x2e, 0xd2, 0x90, 0x40, 0xb4, 0x7b, 0xfe, 0x4b, 0xf1, 0xd3, 0x25, 0xc5, 0xeb,
	0xef, 0x94, 0x57, 0xfa, 0x33, 0x00, 0x79, 0x92, 0xa6, 0xcb, 0x52, 0x2f, 0xd5, 0x7c, 0x6a, 0xd4,
	0x62, 0x7b, 0x82, 0xd6, 0xf6, 0xb4, 0x37, 0xa5, 0xb3, 0xb2, 0x29, 0x37, 0x6d, 0xd6, 0x21, 0xdc,
	0x31, 0x27, 0x33, 0xba, 0x9e, 0x9c, 0x2d, 0xef, 0xd7, 0x0a, 0xea, 0xbe, 0x9b, 0x4c, 0x33, 0xd4,
	0x74, 0x91, 0x56, 0x3b, 0xd6, 0xe4, 0x22, 0x84, 0x5b, 0x3e, 0x7e, 0x8b, 0x49, 0x89, 0x54, 0xed,
	0xd8, 0x12, 0x16, 0x7e, 0x0f, 0x60, 0xfb, 0x0f, 0x23, 0xe2, 0x05, 0xf4, 0xaf, 0x51, 0xa5, 0x58,
	0xca, 0x60, 0x3f, 0x18, 0x0d, 0x27, 0x47, 0x8b, 0x91, 0xf8, 0x97, 0x25, 0xaa, 0x5f, 0x96, 0xa8,
	0x6a, 0x79, 0xcd, 0xf4, 0xb8, 0x6a, 0x13, 0xe7, 0x30, 0x28, 0xfc, 0x34, 0xd8, 0xed, 0x70, 0xf2,
	0xe4, 0xc6, 0xa1, 0xfe, 0x6d, 0x84, 0x71, 0xdd, 0x1d, 0x7e, 0x0b, 0x40, 0xb4, 0x59, 0xd5, 0xf9,
	0xbe, 0x6c, 0x09, 0x74, 0x9f, 0x1f, 0xad, 0x13, 0xe8, 0x7b, 0x56, 0x14, 0x1e, 0xb7, 0x15, 0x06,
	0xff, 0x7e, 0x4a, 0x2a, 0xf2, 0xe9, 0x73, 0xd8, 0x4b, 0x4c, 0x1e, 0x51, 0xb2, 0xa0, 0xf9, 0x26,
	0xe6, 0xbf, 0xdf, 0x73, 0x85, 0xc4, 0xe4, 0xcd, 0x0b, 0xef, 0xdf, 0x63, 0x2e, 0xfe, 0x0e, 0x00,
	0x00, 0xff, 0xff, 0xda, 0x30, 0x2a, 0x0e, 0x00, 0x06, 0x00, 0x00,
}

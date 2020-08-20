// Code generated by protoc-gen-go. DO NOT EDIT.
// source: protocol/gaia/proxy/proxy.proto

package proxy // import "tcl.com/gaia/protocol/proxy"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _ "github.com/golang/protobuf/ptypes/any"
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

type ProxyRequestType int32

const (
	ProxyRequestType_GET_RESOURCE_CHUNKS ProxyRequestType = 0
	ProxyRequestType_GET_RESOURCES       ProxyRequestType = 1
)

var ProxyRequestType_name = map[int32]string{
	0: "GET_RESOURCE_CHUNKS",
	1: "GET_RESOURCES",
}
var ProxyRequestType_value = map[string]int32{
	"GET_RESOURCE_CHUNKS": 0,
	"GET_RESOURCES":       1,
}

func (x ProxyRequestType) Enum() *ProxyRequestType {
	p := new(ProxyRequestType)
	*p = x
	return p
}
func (x ProxyRequestType) String() string {
	return proto.EnumName(ProxyRequestType_name, int32(x))
}
func (x *ProxyRequestType) UnmarshalJSON(data []byte) error {
	value, err := proto.UnmarshalJSONEnum(ProxyRequestType_value, data, "ProxyRequestType")
	if err != nil {
		return err
	}
	*x = ProxyRequestType(value)
	return nil
}
func (ProxyRequestType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{0}
}

type GetResourceChunksRequest struct {
	ResourceType         *string  `protobuf:"bytes,1,req,name=resource_type,json=resourceType" json:"resource_type,omitempty"`
	ChunkSize            *int32   `protobuf:"varint,2,req,name=chunk_size,json=chunkSize" json:"chunk_size,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetResourceChunksRequest) Reset()         { *m = GetResourceChunksRequest{} }
func (m *GetResourceChunksRequest) String() string { return proto.CompactTextString(m) }
func (*GetResourceChunksRequest) ProtoMessage()    {}
func (*GetResourceChunksRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{0}
}
func (m *GetResourceChunksRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetResourceChunksRequest.Unmarshal(m, b)
}
func (m *GetResourceChunksRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetResourceChunksRequest.Marshal(b, m, deterministic)
}
func (dst *GetResourceChunksRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetResourceChunksRequest.Merge(dst, src)
}
func (m *GetResourceChunksRequest) XXX_Size() int {
	return xxx_messageInfo_GetResourceChunksRequest.Size(m)
}
func (m *GetResourceChunksRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetResourceChunksRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetResourceChunksRequest proto.InternalMessageInfo

func (m *GetResourceChunksRequest) GetResourceType() string {
	if m != nil && m.ResourceType != nil {
		return *m.ResourceType
	}
	return ""
}

func (m *GetResourceChunksRequest) GetChunkSize() int32 {
	if m != nil && m.ChunkSize != nil {
		return *m.ChunkSize
	}
	return 0
}

type GetResourceChunksResponse struct {
	Delimiters           []string `protobuf:"bytes,1,rep,name=delimiters" json:"delimiters,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetResourceChunksResponse) Reset()         { *m = GetResourceChunksResponse{} }
func (m *GetResourceChunksResponse) String() string { return proto.CompactTextString(m) }
func (*GetResourceChunksResponse) ProtoMessage()    {}
func (*GetResourceChunksResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{1}
}
func (m *GetResourceChunksResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetResourceChunksResponse.Unmarshal(m, b)
}
func (m *GetResourceChunksResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetResourceChunksResponse.Marshal(b, m, deterministic)
}
func (dst *GetResourceChunksResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetResourceChunksResponse.Merge(dst, src)
}
func (m *GetResourceChunksResponse) XXX_Size() int {
	return xxx_messageInfo_GetResourceChunksResponse.Size(m)
}
func (m *GetResourceChunksResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetResourceChunksResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetResourceChunksResponse proto.InternalMessageInfo

func (m *GetResourceChunksResponse) GetDelimiters() []string {
	if m != nil {
		return m.Delimiters
	}
	return nil
}

type GetResourcesRequest struct {
	ResourceType         *string  `protobuf:"bytes,1,req,name=resource_type,json=resourceType" json:"resource_type,omitempty"`
	NextId               *string  `protobuf:"bytes,2,opt,name=next_id,json=nextId" json:"next_id,omitempty"`
	EndId                *string  `protobuf:"bytes,3,opt,name=end_id,json=endId" json:"end_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetResourcesRequest) Reset()         { *m = GetResourcesRequest{} }
func (m *GetResourcesRequest) String() string { return proto.CompactTextString(m) }
func (*GetResourcesRequest) ProtoMessage()    {}
func (*GetResourcesRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{2}
}
func (m *GetResourcesRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetResourcesRequest.Unmarshal(m, b)
}
func (m *GetResourcesRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetResourcesRequest.Marshal(b, m, deterministic)
}
func (dst *GetResourcesRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetResourcesRequest.Merge(dst, src)
}
func (m *GetResourcesRequest) XXX_Size() int {
	return xxx_messageInfo_GetResourcesRequest.Size(m)
}
func (m *GetResourcesRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetResourcesRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetResourcesRequest proto.InternalMessageInfo

func (m *GetResourcesRequest) GetResourceType() string {
	if m != nil && m.ResourceType != nil {
		return *m.ResourceType
	}
	return ""
}

func (m *GetResourcesRequest) GetNextId() string {
	if m != nil && m.NextId != nil {
		return *m.NextId
	}
	return ""
}

func (m *GetResourcesRequest) GetEndId() string {
	if m != nil && m.EndId != nil {
		return *m.EndId
	}
	return ""
}

type GetResourcesResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetResourcesResponse) Reset()         { *m = GetResourcesResponse{} }
func (m *GetResourcesResponse) String() string { return proto.CompactTextString(m) }
func (*GetResourcesResponse) ProtoMessage()    {}
func (*GetResourcesResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{3}
}
func (m *GetResourcesResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetResourcesResponse.Unmarshal(m, b)
}
func (m *GetResourcesResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetResourcesResponse.Marshal(b, m, deterministic)
}
func (dst *GetResourcesResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetResourcesResponse.Merge(dst, src)
}
func (m *GetResourcesResponse) XXX_Size() int {
	return xxx_messageInfo_GetResourcesResponse.Size(m)
}
func (m *GetResourcesResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetResourcesResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetResourcesResponse proto.InternalMessageInfo

type ProxyRequestPayload struct {
	PartnerName      *string `protobuf:"bytes,1,req,name=partner_name,json=partnerName" json:"partner_name,omitempty"`
	ProxyRequestType *string `protobuf:"bytes,2,req,name=proxy_request_type,json=proxyRequestType" json:"proxy_request_type,omitempty"`
	// Types that are valid to be assigned to Body:
	//	*ProxyRequestPayload_GetResourceChunksRequest
	//	*ProxyRequestPayload_GetResourcesRequest
	Body                 isProxyRequestPayload_Body `protobuf_oneof:"body"`
	XXX_NoUnkeyedLiteral struct{}                   `json:"-"`
	XXX_unrecognized     []byte                     `json:"-"`
	XXX_sizecache        int32                      `json:"-"`
}

func (m *ProxyRequestPayload) Reset()         { *m = ProxyRequestPayload{} }
func (m *ProxyRequestPayload) String() string { return proto.CompactTextString(m) }
func (*ProxyRequestPayload) ProtoMessage()    {}
func (*ProxyRequestPayload) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{4}
}
func (m *ProxyRequestPayload) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ProxyRequestPayload.Unmarshal(m, b)
}
func (m *ProxyRequestPayload) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ProxyRequestPayload.Marshal(b, m, deterministic)
}
func (dst *ProxyRequestPayload) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ProxyRequestPayload.Merge(dst, src)
}
func (m *ProxyRequestPayload) XXX_Size() int {
	return xxx_messageInfo_ProxyRequestPayload.Size(m)
}
func (m *ProxyRequestPayload) XXX_DiscardUnknown() {
	xxx_messageInfo_ProxyRequestPayload.DiscardUnknown(m)
}

var xxx_messageInfo_ProxyRequestPayload proto.InternalMessageInfo

func (m *ProxyRequestPayload) GetPartnerName() string {
	if m != nil && m.PartnerName != nil {
		return *m.PartnerName
	}
	return ""
}

func (m *ProxyRequestPayload) GetProxyRequestType() string {
	if m != nil && m.ProxyRequestType != nil {
		return *m.ProxyRequestType
	}
	return ""
}

type isProxyRequestPayload_Body interface {
	isProxyRequestPayload_Body()
}

type ProxyRequestPayload_GetResourceChunksRequest struct {
	GetResourceChunksRequest *GetResourceChunksRequest `protobuf:"bytes,3,opt,name=get_resource_chunks_request,json=getResourceChunksRequest,oneof"`
}

type ProxyRequestPayload_GetResourcesRequest struct {
	GetResourcesRequest *GetResourcesRequest `protobuf:"bytes,4,opt,name=get_resources_request,json=getResourcesRequest,oneof"`
}

func (*ProxyRequestPayload_GetResourceChunksRequest) isProxyRequestPayload_Body() {}

func (*ProxyRequestPayload_GetResourcesRequest) isProxyRequestPayload_Body() {}

func (m *ProxyRequestPayload) GetBody() isProxyRequestPayload_Body {
	if m != nil {
		return m.Body
	}
	return nil
}

func (m *ProxyRequestPayload) GetGetResourceChunksRequest() *GetResourceChunksRequest {
	if x, ok := m.GetBody().(*ProxyRequestPayload_GetResourceChunksRequest); ok {
		return x.GetResourceChunksRequest
	}
	return nil
}

func (m *ProxyRequestPayload) GetGetResourcesRequest() *GetResourcesRequest {
	if x, ok := m.GetBody().(*ProxyRequestPayload_GetResourcesRequest); ok {
		return x.GetResourcesRequest
	}
	return nil
}

// XXX_OneofFuncs is for the internal use of the proto package.
func (*ProxyRequestPayload) XXX_OneofFuncs() (func(msg proto.Message, b *proto.Buffer) error, func(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error), func(msg proto.Message) (n int), []interface{}) {
	return _ProxyRequestPayload_OneofMarshaler, _ProxyRequestPayload_OneofUnmarshaler, _ProxyRequestPayload_OneofSizer, []interface{}{
		(*ProxyRequestPayload_GetResourceChunksRequest)(nil),
		(*ProxyRequestPayload_GetResourcesRequest)(nil),
	}
}

func _ProxyRequestPayload_OneofMarshaler(msg proto.Message, b *proto.Buffer) error {
	m := msg.(*ProxyRequestPayload)
	// body
	switch x := m.Body.(type) {
	case *ProxyRequestPayload_GetResourceChunksRequest:
		b.EncodeVarint(3<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.GetResourceChunksRequest); err != nil {
			return err
		}
	case *ProxyRequestPayload_GetResourcesRequest:
		b.EncodeVarint(4<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.GetResourcesRequest); err != nil {
			return err
		}
	case nil:
	default:
		return fmt.Errorf("ProxyRequestPayload.Body has unexpected type %T", x)
	}
	return nil
}

func _ProxyRequestPayload_OneofUnmarshaler(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error) {
	m := msg.(*ProxyRequestPayload)
	switch tag {
	case 3: // body.get_resource_chunks_request
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(GetResourceChunksRequest)
		err := b.DecodeMessage(msg)
		m.Body = &ProxyRequestPayload_GetResourceChunksRequest{msg}
		return true, err
	case 4: // body.get_resources_request
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(GetResourcesRequest)
		err := b.DecodeMessage(msg)
		m.Body = &ProxyRequestPayload_GetResourcesRequest{msg}
		return true, err
	default:
		return false, nil
	}
}

func _ProxyRequestPayload_OneofSizer(msg proto.Message) (n int) {
	m := msg.(*ProxyRequestPayload)
	// body
	switch x := m.Body.(type) {
	case *ProxyRequestPayload_GetResourceChunksRequest:
		s := proto.Size(x.GetResourceChunksRequest)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case *ProxyRequestPayload_GetResourcesRequest:
		s := proto.Size(x.GetResourcesRequest)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case nil:
	default:
		panic(fmt.Sprintf("proto: unexpected type %T in oneof", x))
	}
	return n
}

type ProxyRequest struct {
	Header               *constant.RequestHeader `protobuf:"bytes,1,opt,name=header" json:"header,omitempty"`
	Payload              *ProxyRequestPayload    `protobuf:"bytes,2,req,name=payload" json:"payload,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                `json:"-"`
	XXX_unrecognized     []byte                  `json:"-"`
	XXX_sizecache        int32                   `json:"-"`
}

func (m *ProxyRequest) Reset()         { *m = ProxyRequest{} }
func (m *ProxyRequest) String() string { return proto.CompactTextString(m) }
func (*ProxyRequest) ProtoMessage()    {}
func (*ProxyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{5}
}
func (m *ProxyRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ProxyRequest.Unmarshal(m, b)
}
func (m *ProxyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ProxyRequest.Marshal(b, m, deterministic)
}
func (dst *ProxyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ProxyRequest.Merge(dst, src)
}
func (m *ProxyRequest) XXX_Size() int {
	return xxx_messageInfo_ProxyRequest.Size(m)
}
func (m *ProxyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ProxyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ProxyRequest proto.InternalMessageInfo

func (m *ProxyRequest) GetHeader() *constant.RequestHeader {
	if m != nil {
		return m.Header
	}
	return nil
}

func (m *ProxyRequest) GetPayload() *ProxyRequestPayload {
	if m != nil {
		return m.Payload
	}
	return nil
}

type ProxyResponsePayload struct {
	HttpStatusCode *int32 `protobuf:"varint,1,req,name=http_status_code,json=httpStatusCode" json:"http_status_code,omitempty"`
	// Types that are valid to be assigned to Response:
	//	*ProxyResponsePayload_GetResourceChunksResponse
	//	*ProxyResponsePayload_GetResourcesResponse
	Response             isProxyResponsePayload_Response `protobuf_oneof:"response"`
	XXX_NoUnkeyedLiteral struct{}                        `json:"-"`
	XXX_unrecognized     []byte                          `json:"-"`
	XXX_sizecache        int32                           `json:"-"`
}

func (m *ProxyResponsePayload) Reset()         { *m = ProxyResponsePayload{} }
func (m *ProxyResponsePayload) String() string { return proto.CompactTextString(m) }
func (*ProxyResponsePayload) ProtoMessage()    {}
func (*ProxyResponsePayload) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{6}
}
func (m *ProxyResponsePayload) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ProxyResponsePayload.Unmarshal(m, b)
}
func (m *ProxyResponsePayload) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ProxyResponsePayload.Marshal(b, m, deterministic)
}
func (dst *ProxyResponsePayload) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ProxyResponsePayload.Merge(dst, src)
}
func (m *ProxyResponsePayload) XXX_Size() int {
	return xxx_messageInfo_ProxyResponsePayload.Size(m)
}
func (m *ProxyResponsePayload) XXX_DiscardUnknown() {
	xxx_messageInfo_ProxyResponsePayload.DiscardUnknown(m)
}

var xxx_messageInfo_ProxyResponsePayload proto.InternalMessageInfo

func (m *ProxyResponsePayload) GetHttpStatusCode() int32 {
	if m != nil && m.HttpStatusCode != nil {
		return *m.HttpStatusCode
	}
	return 0
}

type isProxyResponsePayload_Response interface {
	isProxyResponsePayload_Response()
}

type ProxyResponsePayload_GetResourceChunksResponse struct {
	GetResourceChunksResponse *GetResourceChunksResponse `protobuf:"bytes,2,opt,name=get_resource_chunks_response,json=getResourceChunksResponse,oneof"`
}

type ProxyResponsePayload_GetResourcesResponse struct {
	GetResourcesResponse *GetResourcesResponse `protobuf:"bytes,3,opt,name=get_resources_response,json=getResourcesResponse,oneof"`
}

func (*ProxyResponsePayload_GetResourceChunksResponse) isProxyResponsePayload_Response() {}

func (*ProxyResponsePayload_GetResourcesResponse) isProxyResponsePayload_Response() {}

func (m *ProxyResponsePayload) GetResponse() isProxyResponsePayload_Response {
	if m != nil {
		return m.Response
	}
	return nil
}

func (m *ProxyResponsePayload) GetGetResourceChunksResponse() *GetResourceChunksResponse {
	if x, ok := m.GetResponse().(*ProxyResponsePayload_GetResourceChunksResponse); ok {
		return x.GetResourceChunksResponse
	}
	return nil
}

func (m *ProxyResponsePayload) GetGetResourcesResponse() *GetResourcesResponse {
	if x, ok := m.GetResponse().(*ProxyResponsePayload_GetResourcesResponse); ok {
		return x.GetResourcesResponse
	}
	return nil
}

// XXX_OneofFuncs is for the internal use of the proto package.
func (*ProxyResponsePayload) XXX_OneofFuncs() (func(msg proto.Message, b *proto.Buffer) error, func(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error), func(msg proto.Message) (n int), []interface{}) {
	return _ProxyResponsePayload_OneofMarshaler, _ProxyResponsePayload_OneofUnmarshaler, _ProxyResponsePayload_OneofSizer, []interface{}{
		(*ProxyResponsePayload_GetResourceChunksResponse)(nil),
		(*ProxyResponsePayload_GetResourcesResponse)(nil),
	}
}

func _ProxyResponsePayload_OneofMarshaler(msg proto.Message, b *proto.Buffer) error {
	m := msg.(*ProxyResponsePayload)
	// response
	switch x := m.Response.(type) {
	case *ProxyResponsePayload_GetResourceChunksResponse:
		b.EncodeVarint(2<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.GetResourceChunksResponse); err != nil {
			return err
		}
	case *ProxyResponsePayload_GetResourcesResponse:
		b.EncodeVarint(3<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.GetResourcesResponse); err != nil {
			return err
		}
	case nil:
	default:
		return fmt.Errorf("ProxyResponsePayload.Response has unexpected type %T", x)
	}
	return nil
}

func _ProxyResponsePayload_OneofUnmarshaler(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error) {
	m := msg.(*ProxyResponsePayload)
	switch tag {
	case 2: // response.get_resource_chunks_response
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(GetResourceChunksResponse)
		err := b.DecodeMessage(msg)
		m.Response = &ProxyResponsePayload_GetResourceChunksResponse{msg}
		return true, err
	case 3: // response.get_resources_response
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(GetResourcesResponse)
		err := b.DecodeMessage(msg)
		m.Response = &ProxyResponsePayload_GetResourcesResponse{msg}
		return true, err
	default:
		return false, nil
	}
}

func _ProxyResponsePayload_OneofSizer(msg proto.Message) (n int) {
	m := msg.(*ProxyResponsePayload)
	// response
	switch x := m.Response.(type) {
	case *ProxyResponsePayload_GetResourceChunksResponse:
		s := proto.Size(x.GetResourceChunksResponse)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case *ProxyResponsePayload_GetResourcesResponse:
		s := proto.Size(x.GetResourcesResponse)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case nil:
	default:
		panic(fmt.Sprintf("proto: unexpected type %T in oneof", x))
	}
	return n
}

type ProxyResponse struct {
	Header               *constant.ResponseHeader `protobuf:"bytes,1,req,name=header" json:"header,omitempty"`
	Payload              *ProxyResponsePayload    `protobuf:"bytes,2,opt,name=payload" json:"payload,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                 `json:"-"`
	XXX_unrecognized     []byte                   `json:"-"`
	XXX_sizecache        int32                    `json:"-"`
}

func (m *ProxyResponse) Reset()         { *m = ProxyResponse{} }
func (m *ProxyResponse) String() string { return proto.CompactTextString(m) }
func (*ProxyResponse) ProtoMessage()    {}
func (*ProxyResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_proxy_9cc343887d349b0f, []int{7}
}
func (m *ProxyResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ProxyResponse.Unmarshal(m, b)
}
func (m *ProxyResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ProxyResponse.Marshal(b, m, deterministic)
}
func (dst *ProxyResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ProxyResponse.Merge(dst, src)
}
func (m *ProxyResponse) XXX_Size() int {
	return xxx_messageInfo_ProxyResponse.Size(m)
}
func (m *ProxyResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ProxyResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ProxyResponse proto.InternalMessageInfo

func (m *ProxyResponse) GetHeader() *constant.ResponseHeader {
	if m != nil {
		return m.Header
	}
	return nil
}

func (m *ProxyResponse) GetPayload() *ProxyResponsePayload {
	if m != nil {
		return m.Payload
	}
	return nil
}

func init() {
	proto.RegisterType((*GetResourceChunksRequest)(nil), "protocol.gaia.proxy.GetResourceChunksRequest")
	proto.RegisterType((*GetResourceChunksResponse)(nil), "protocol.gaia.proxy.GetResourceChunksResponse")
	proto.RegisterType((*GetResourcesRequest)(nil), "protocol.gaia.proxy.GetResourcesRequest")
	proto.RegisterType((*GetResourcesResponse)(nil), "protocol.gaia.proxy.GetResourcesResponse")
	proto.RegisterType((*ProxyRequestPayload)(nil), "protocol.gaia.proxy.ProxyRequestPayload")
	proto.RegisterType((*ProxyRequest)(nil), "protocol.gaia.proxy.ProxyRequest")
	proto.RegisterType((*ProxyResponsePayload)(nil), "protocol.gaia.proxy.ProxyResponsePayload")
	proto.RegisterType((*ProxyResponse)(nil), "protocol.gaia.proxy.ProxyResponse")
	proto.RegisterEnum("protocol.gaia.proxy.ProxyRequestType", ProxyRequestType_name, ProxyRequestType_value)
}

func init() {
	proto.RegisterFile("protocol/gaia/proxy/proxy.proto", fileDescriptor_proxy_9cc343887d349b0f)
}

var fileDescriptor_proxy_9cc343887d349b0f = []byte{
	// 619 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x94, 0x94, 0xdd, 0x6e, 0xd3, 0x3c,
	0x1c, 0xc6, 0x97, 0x6c, 0xeb, 0xde, 0xfe, 0xb7, 0xbd, 0x2a, 0xee, 0x3e, 0xb2, 0x8d, 0x8f, 0x12,
	0x24, 0x16, 0x10, 0x24, 0xd2, 0x0e, 0x41, 0x02, 0xd4, 0x6a, 0x5a, 0x27, 0xa4, 0x51, 0xb9, 0xdb,
	0x09, 0x07, 0x8b, 0xbc, 0xc4, 0xa4, 0x81, 0xc6, 0xce, 0x12, 0x57, 0x5a, 0x77, 0x1b, 0x48, 0x5c,
	0x00, 0x17, 0xc2, 0xb5, 0xa1, 0xd8, 0x49, 0x9b, 0x76, 0x29, 0x8c, 0x93, 0x4a, 0x7d, 0xfe, 0x1f,
	0xcf, 0x13, 0xff, 0x9c, 0xc0, 0x93, 0x38, 0xe1, 0x82, 0x7b, 0x7c, 0xe8, 0x04, 0x24, 0x24, 0x4e,
	0x9c, 0xf0, 0x9b, 0xb1, 0xfa, 0xb5, 0x65, 0x05, 0x35, 0x8b, 0x06, 0x3b, 0x6b, 0xb0, 0x65, 0x69,
	0x7f, 0x2f, 0xe0, 0x3c, 0x18, 0x52, 0x47, 0xd6, 0xae, 0x46, 0x5f, 0x1c, 0xc2, 0xf2, 0xfe, 0xfd,
	0xe7, 0x93, 0x85, 0x1e, 0x8f, 0x22, 0xce, 0x1c, 0x8f, 0xb3, 0x54, 0x10, 0x26, 0x9c, 0x84, 0x5e,
	0x8f, 0x68, 0x2a, 0xf2, 0xbe, 0xc3, 0x3f, 0xf4, 0xa5, 0x31, 0x67, 0x29, 0x55, 0x8d, 0xe6, 0x25,
	0x18, 0x27, 0x54, 0x60, 0x9a, 0xf2, 0x51, 0xe2, 0xd1, 0xce, 0x60, 0xc4, 0xbe, 0xa5, 0x58, 0xad,
	0x42, 0xcf, 0x60, 0x33, 0xc9, 0x0b, 0xae, 0x18, 0xc7, 0xd4, 0xd0, 0x5a, 0xba, 0x55, 0xc7, 0x1b,
	0x85, 0x78, 0x3e, 0x8e, 0x29, 0x7a, 0x04, 0xe0, 0x65, 0x53, 0x6e, 0x1a, 0xde, 0x52, 0x43, 0x6f,
	0xe9, 0xd6, 0x2a, 0xae, 0x4b, 0xa5, 0x1f, 0xde, 0x52, 0xf3, 0x2d, 0xec, 0x55, 0xec, 0x57, 0x11,
	0xd0, 0x63, 0x00, 0x9f, 0x0e, 0xc3, 0x28, 0x14, 0x34, 0x49, 0x0d, 0xad, 0xb5, 0x6c, 0xd5, 0x71,
	0x49, 0x31, 0xbf, 0x42, 0xb3, 0x34, 0xfc, 0x6f, 0xb9, 0x76, 0x61, 0x8d, 0xd1, 0x1b, 0xe1, 0x86,
	0xbe, 0xa1, 0xb7, 0x34, 0xab, 0x8e, 0x6b, 0xd9, 0xdf, 0x53, 0x1f, 0x6d, 0x43, 0x8d, 0x32, 0x3f,
	0xd3, 0x97, 0xa5, 0xbe, 0x4a, 0x99, 0x7f, 0xea, 0x9b, 0x3b, 0xb0, 0x35, 0xeb, 0xa5, 0x32, 0x9a,
	0xbf, 0x74, 0x68, 0xf6, 0x32, 0x2c, 0xb9, 0x7b, 0x8f, 0x8c, 0x87, 0x9c, 0xf8, 0xe8, 0x29, 0x6c,
	0xc4, 0x24, 0x11, 0x8c, 0x26, 0x2e, 0x23, 0x51, 0x91, 0x61, 0x3d, 0xd7, 0xce, 0x48, 0x44, 0xd1,
	0x2b, 0x40, 0x12, 0xa8, 0x9b, 0xb3, 0x51, 0x61, 0x75, 0xd9, 0xd8, 0x88, 0x4b, 0x3b, 0x65, 0x60,
	0x06, 0x07, 0x01, 0x15, 0xee, 0xe4, 0xc9, 0xe4, 0x19, 0xa6, 0xc5, 0xac, 0x0c, 0xbb, 0x7e, 0xf4,
	0xda, 0xae, 0xb8, 0x30, 0xf6, 0x22, 0x82, 0xdd, 0x25, 0x6c, 0x04, 0x8b, 0xe8, 0x5e, 0xc2, 0x76,
	0xd9, 0x6f, 0xea, 0xb4, 0x22, 0x9d, 0xac, 0xbf, 0x39, 0x95, 0x4c, 0x9a, 0xc1, 0x5d, 0xb9, 0x5d,
	0x83, 0x95, 0x2b, 0xee, 0x8f, 0xcd, 0xef, 0x1a, 0x6c, 0x94, 0x0f, 0x10, 0xbd, 0x87, 0xda, 0x80,
	0x12, 0x9f, 0x26, 0x86, 0x26, 0x9d, 0x0e, 0xa7, 0x4e, 0xea, 0xb2, 0xda, 0xc5, 0x65, 0xb5, 0x0b,
	0x0b, 0xd9, 0x8e, 0xf3, 0x31, 0xd4, 0x86, 0xb5, 0x58, 0x51, 0x90, 0x87, 0xb9, 0x28, 0x6b, 0x05,
	0x35, 0x5c, 0x0c, 0x9a, 0x3f, 0x75, 0xd8, 0xca, 0x1b, 0x14, 0xe8, 0x82, 0xab, 0x05, 0x8d, 0x81,
	0x10, 0xb1, 0x9b, 0x0a, 0x22, 0x46, 0xa9, 0xeb, 0x71, 0x5f, 0xb1, 0x5d, 0xc5, 0xff, 0x67, 0x7a,
	0x5f, 0xca, 0x1d, 0xee, 0x53, 0x74, 0x0d, 0x0f, 0xab, 0x81, 0xa9, 0x85, 0xf2, 0xda, 0xad, 0x1f,
	0xd9, 0xf7, 0x25, 0xa6, 0xa6, 0xba, 0x4b, 0x78, 0x2f, 0x58, 0xf8, 0xc2, 0x10, 0xd8, 0x99, 0x67,
	0x96, 0x9b, 0xa9, 0xeb, 0xf1, 0xe2, 0x1e, 0xd0, 0x26, 0x3e, 0x5b, 0x41, 0x85, 0xde, 0x06, 0xf8,
	0xaf, 0x58, 0x6a, 0xfe, 0xd0, 0x60, 0x73, 0xe6, 0x90, 0xd0, 0x87, 0x12, 0xbb, 0xb9, 0x93, 0xbf,
	0xcb, 0x2e, 0x77, 0x9a, 0x85, 0xd7, 0x29, 0xc3, 0x5b, 0x9c, 0xb9, 0x8a, 0xcd, 0x84, 0xde, 0xcb,
	0x77, 0xd0, 0xe8, 0xcd, 0xbf, 0x3f, 0xbb, 0xd0, 0x3c, 0x39, 0x3e, 0x77, 0xf1, 0x71, 0xff, 0xd3,
	0x05, 0xee, 0x1c, 0xbb, 0x9d, 0xee, 0xc5, 0xd9, 0xc7, 0x7e, 0x63, 0x09, 0x3d, 0x80, 0xcd, 0x72,
	0xa1, 0xdf, 0xd0, 0xda, 0x6f, 0xe0, 0xc0, 0xe3, 0x91, 0x2d, 0xbc, 0xa9, 0xa7, 0x4a, 0x20, 0xcd,
	0x3f, 0x1f, 0x64, 0x05, 0x8f, 0x47, 0x93, 0xaf, 0xb6, 0xfa, 0x94, 0xca, 0xe2, 0xef, 0x00, 0x00,
	0x00, 0xff, 0xff, 0xa0, 0x86, 0xcc, 0x82, 0xd4, 0x05, 0x00, 0x00,
}

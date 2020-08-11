// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.4
// source: common/tsl/method.proto

package tsl

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type TSLMethodStatus int32

const (
	TSLMethodStatus_TSL_METHOD_STATUS_UNKNOWN     TSLMethodStatus = 0
	TSLMethodStatus_TSL_METHOD_STATUS_DELIVERED   TSLMethodStatus = 1
	TSLMethodStatus_TSL_METHOD_STATUS_UNDELIVERED TSLMethodStatus = 2
	TSLMethodStatus_TSL_METHOD_STATUS_COMPLETE    TSLMethodStatus = 3
)

// Enum value maps for TSLMethodStatus.
var (
	TSLMethodStatus_name = map[int32]string{
		0: "TSL_METHOD_STATUS_UNKNOWN",
		1: "TSL_METHOD_STATUS_DELIVERED",
		2: "TSL_METHOD_STATUS_UNDELIVERED",
		3: "TSL_METHOD_STATUS_COMPLETE",
	}
	TSLMethodStatus_value = map[string]int32{
		"TSL_METHOD_STATUS_UNKNOWN":     0,
		"TSL_METHOD_STATUS_DELIVERED":   1,
		"TSL_METHOD_STATUS_UNDELIVERED": 2,
		"TSL_METHOD_STATUS_COMPLETE":    3,
	}
)

func (x TSLMethodStatus) Enum() *TSLMethodStatus {
	p := new(TSLMethodStatus)
	*p = x
	return p
}

func (x TSLMethodStatus) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (TSLMethodStatus) Descriptor() protoreflect.EnumDescriptor {
	return file_common_tsl_method_proto_enumTypes[0].Descriptor()
}

func (TSLMethodStatus) Type() protoreflect.EnumType {
	return &file_common_tsl_method_proto_enumTypes[0]
}

func (x TSLMethodStatus) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Do not use.
func (x *TSLMethodStatus) UnmarshalJSON(b []byte) error {
	num, err := protoimpl.X.UnmarshalJSONEnum(x.Descriptor(), b)
	if err != nil {
		return err
	}
	*x = TSLMethodStatus(num)
	return nil
}

// Deprecated: Use TSLMethodStatus.Descriptor instead.
func (TSLMethodStatus) EnumDescriptor() ([]byte, []int) {
	return file_common_tsl_method_proto_rawDescGZIP(), []int{0}
}

type TSLMethod struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	DeviceId     *string           `protobuf:"bytes,1,req,name=deviceId" json:"deviceId,omitempty"`
	InvocationId *string           `protobuf:"bytes,2,req,name=invocationId" json:"invocationId,omitempty"`
	Status       *TSLMethodStatus  `protobuf:"varint,3,req,name=status,enum=common.tsl.TSLMethodStatus" json:"status,omitempty"`
	InputParams  []*TSLValueObject `protobuf:"bytes,4,rep,name=inputParams" json:"inputParams,omitempty"`
	OutputValues []*TSLValueObject `protobuf:"bytes,5,rep,name=outputValues" json:"outputValues,omitempty"`
	Timestamp    *string           `protobuf:"bytes,6,req,name=timestamp" json:"timestamp,omitempty"`
}

func (x *TSLMethod) Reset() {
	*x = TSLMethod{}
	if protoimpl.UnsafeEnabled {
		mi := &file_common_tsl_method_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TSLMethod) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TSLMethod) ProtoMessage() {}

func (x *TSLMethod) ProtoReflect() protoreflect.Message {
	mi := &file_common_tsl_method_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TSLMethod.ProtoReflect.Descriptor instead.
func (*TSLMethod) Descriptor() ([]byte, []int) {
	return file_common_tsl_method_proto_rawDescGZIP(), []int{0}
}

func (x *TSLMethod) GetDeviceId() string {
	if x != nil && x.DeviceId != nil {
		return *x.DeviceId
	}
	return ""
}

func (x *TSLMethod) GetInvocationId() string {
	if x != nil && x.InvocationId != nil {
		return *x.InvocationId
	}
	return ""
}

func (x *TSLMethod) GetStatus() TSLMethodStatus {
	if x != nil && x.Status != nil {
		return *x.Status
	}
	return TSLMethodStatus_TSL_METHOD_STATUS_UNKNOWN
}

func (x *TSLMethod) GetInputParams() []*TSLValueObject {
	if x != nil {
		return x.InputParams
	}
	return nil
}

func (x *TSLMethod) GetOutputValues() []*TSLValueObject {
	if x != nil {
		return x.OutputValues
	}
	return nil
}

func (x *TSLMethod) GetTimestamp() string {
	if x != nil && x.Timestamp != nil {
		return *x.Timestamp
	}
	return ""
}

var File_common_tsl_method_proto protoreflect.FileDescriptor

var file_common_tsl_method_proto_rawDesc = []byte{
	0x0a, 0x17, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x74, 0x73, 0x6c, 0x2f, 0x6d, 0x65, 0x74,
	0x68, 0x6f, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x74, 0x73, 0x6c, 0x1a, 0x16, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x74, 0x73,
	0x6c, 0x2f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9c, 0x02,
	0x0a, 0x09, 0x54, 0x53, 0x4c, 0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x64,
	0x65, 0x76, 0x69, 0x63, 0x65, 0x49, 0x64, 0x18, 0x01, 0x20, 0x02, 0x28, 0x09, 0x52, 0x08, 0x64,
	0x65, 0x76, 0x69, 0x63, 0x65, 0x49, 0x64, 0x12, 0x22, 0x0a, 0x0c, 0x69, 0x6e, 0x76, 0x6f, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x18, 0x02, 0x20, 0x02, 0x28, 0x09, 0x52, 0x0c, 0x69,
	0x6e, 0x76, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x33, 0x0a, 0x06, 0x73,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x03, 0x20, 0x02, 0x28, 0x0e, 0x32, 0x1b, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x74, 0x73, 0x6c, 0x2e, 0x54, 0x53, 0x4c, 0x4d, 0x65, 0x74, 0x68,
	0x6f, 0x64, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x12, 0x3c, 0x0a, 0x0b, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x18,
	0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x74,
	0x73, 0x6c, 0x2e, 0x54, 0x53, 0x4c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x4f, 0x62, 0x6a, 0x65, 0x63,
	0x74, 0x52, 0x0b, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x12, 0x3e,
	0x0a, 0x0c, 0x6f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x18, 0x05,
	0x20, 0x03, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x74, 0x73,
	0x6c, 0x2e, 0x54, 0x53, 0x4c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74,
	0x52, 0x0c, 0x6f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x12, 0x1c,
	0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x06, 0x20, 0x02, 0x28,
	0x09, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2a, 0x94, 0x01, 0x0a,
	0x0f, 0x54, 0x53, 0x4c, 0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x12, 0x1d, 0x0a, 0x19, 0x54, 0x53, 0x4c, 0x5f, 0x4d, 0x45, 0x54, 0x48, 0x4f, 0x44, 0x5f, 0x53,
	0x54, 0x41, 0x54, 0x55, 0x53, 0x5f, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e, 0x10, 0x00, 0x12,
	0x1f, 0x0a, 0x1b, 0x54, 0x53, 0x4c, 0x5f, 0x4d, 0x45, 0x54, 0x48, 0x4f, 0x44, 0x5f, 0x53, 0x54,
	0x41, 0x54, 0x55, 0x53, 0x5f, 0x44, 0x45, 0x4c, 0x49, 0x56, 0x45, 0x52, 0x45, 0x44, 0x10, 0x01,
	0x12, 0x21, 0x0a, 0x1d, 0x54, 0x53, 0x4c, 0x5f, 0x4d, 0x45, 0x54, 0x48, 0x4f, 0x44, 0x5f, 0x53,
	0x54, 0x41, 0x54, 0x55, 0x53, 0x5f, 0x55, 0x4e, 0x44, 0x45, 0x4c, 0x49, 0x56, 0x45, 0x52, 0x45,
	0x44, 0x10, 0x02, 0x12, 0x1e, 0x0a, 0x1a, 0x54, 0x53, 0x4c, 0x5f, 0x4d, 0x45, 0x54, 0x48, 0x4f,
	0x44, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x55, 0x53, 0x5f, 0x43, 0x4f, 0x4d, 0x50, 0x4c, 0x45, 0x54,
	0x45, 0x10, 0x03, 0x42, 0x24, 0x0a, 0x10, 0x63, 0x6f, 0x6d, 0x2e, 0x74, 0x63, 0x6c, 0x2e, 0x67,
	0x61, 0x69, 0x61, 0x2e, 0x74, 0x73, 0x6c, 0x5a, 0x10, 0x74, 0x63, 0x6c, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x67, 0x61, 0x69, 0x61, 0x2f, 0x74, 0x73, 0x6c,
}

var (
	file_common_tsl_method_proto_rawDescOnce sync.Once
	file_common_tsl_method_proto_rawDescData = file_common_tsl_method_proto_rawDesc
)

func file_common_tsl_method_proto_rawDescGZIP() []byte {
	file_common_tsl_method_proto_rawDescOnce.Do(func() {
		file_common_tsl_method_proto_rawDescData = protoimpl.X.CompressGZIP(file_common_tsl_method_proto_rawDescData)
	})
	return file_common_tsl_method_proto_rawDescData
}

var file_common_tsl_method_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_common_tsl_method_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_common_tsl_method_proto_goTypes = []interface{}{
	(TSLMethodStatus)(0),   // 0: common.tsl.TSLMethodStatus
	(*TSLMethod)(nil),      // 1: common.tsl.TSLMethod
	(*TSLValueObject)(nil), // 2: common.tsl.TSLValueObject
}
var file_common_tsl_method_proto_depIdxs = []int32{
	0, // 0: common.tsl.TSLMethod.status:type_name -> common.tsl.TSLMethodStatus
	2, // 1: common.tsl.TSLMethod.inputParams:type_name -> common.tsl.TSLValueObject
	2, // 2: common.tsl.TSLMethod.outputValues:type_name -> common.tsl.TSLValueObject
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_common_tsl_method_proto_init() }
func file_common_tsl_method_proto_init() {
	if File_common_tsl_method_proto != nil {
		return
	}
	file_common_tsl_value_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_common_tsl_method_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TSLMethod); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_common_tsl_method_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_common_tsl_method_proto_goTypes,
		DependencyIndexes: file_common_tsl_method_proto_depIdxs,
		EnumInfos:         file_common_tsl_method_proto_enumTypes,
		MessageInfos:      file_common_tsl_method_proto_msgTypes,
	}.Build()
	File_common_tsl_method_proto = out.File
	file_common_tsl_method_proto_rawDesc = nil
	file_common_tsl_method_proto_goTypes = nil
	file_common_tsl_method_proto_depIdxs = nil
}
# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from protocol.gaia.proxy import partner_pb2 as protocol_dot_gaia_dot_proxy_dot_partner__pb2
from protocol.gaia.proxy import ping_pb2 as protocol_dot_gaia_dot_proxy_dot_ping__pb2
from protocol.gaia.proxy import proxy_pb2 as protocol_dot_gaia_dot_proxy_dot_proxy__pb2


class GaiaProxyGrpcStub(object):
    """Missing associated documentation comment in .proto file"""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Ping = channel.unary_unary(
                '/protocol.gaia.proxy.GaiaProxyGrpc/Ping',
                request_serializer=protocol_dot_gaia_dot_proxy_dot_ping__pb2.PingRequest.SerializeToString,
                response_deserializer=protocol_dot_gaia_dot_proxy_dot_ping__pb2.PingResponse.FromString,
                )
        self.ListPartner = channel.unary_unary(
                '/protocol.gaia.proxy.GaiaProxyGrpc/ListPartner',
                request_serializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.ListPartnerRequest.SerializeToString,
                response_deserializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.ListPartnerResponse.FromString,
                )
        self.GetPartner = channel.unary_unary(
                '/protocol.gaia.proxy.GaiaProxyGrpc/GetPartner',
                request_serializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.GetPartnerRequest.SerializeToString,
                response_deserializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.GetPartnerResponse.FromString,
                )
        self.AddPartner = channel.unary_unary(
                '/protocol.gaia.proxy.GaiaProxyGrpc/AddPartner',
                request_serializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.AddPartnerRequest.SerializeToString,
                response_deserializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.AddPartnerResponse.FromString,
                )
        self.Proxy = channel.unary_unary(
                '/protocol.gaia.proxy.GaiaProxyGrpc/Proxy',
                request_serializer=protocol_dot_gaia_dot_proxy_dot_proxy__pb2.ProxyRequest.SerializeToString,
                response_deserializer=protocol_dot_gaia_dot_proxy_dot_proxy__pb2.ProxyResponse.FromString,
                )


class GaiaProxyGrpcServicer(object):
    """Missing associated documentation comment in .proto file"""

    def Ping(self, request, context):
        """Missing associated documentation comment in .proto file"""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListPartner(self, request, context):
        """partner management
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetPartner(self, request, context):
        """Missing associated documentation comment in .proto file"""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddPartner(self, request, context):
        """Missing associated documentation comment in .proto file"""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Proxy(self, request, context):
        """proxy
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_GaiaProxyGrpcServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Ping': grpc.unary_unary_rpc_method_handler(
                    servicer.Ping,
                    request_deserializer=protocol_dot_gaia_dot_proxy_dot_ping__pb2.PingRequest.FromString,
                    response_serializer=protocol_dot_gaia_dot_proxy_dot_ping__pb2.PingResponse.SerializeToString,
            ),
            'ListPartner': grpc.unary_unary_rpc_method_handler(
                    servicer.ListPartner,
                    request_deserializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.ListPartnerRequest.FromString,
                    response_serializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.ListPartnerResponse.SerializeToString,
            ),
            'GetPartner': grpc.unary_unary_rpc_method_handler(
                    servicer.GetPartner,
                    request_deserializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.GetPartnerRequest.FromString,
                    response_serializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.GetPartnerResponse.SerializeToString,
            ),
            'AddPartner': grpc.unary_unary_rpc_method_handler(
                    servicer.AddPartner,
                    request_deserializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.AddPartnerRequest.FromString,
                    response_serializer=protocol_dot_gaia_dot_proxy_dot_partner__pb2.AddPartnerResponse.SerializeToString,
            ),
            'Proxy': grpc.unary_unary_rpc_method_handler(
                    servicer.Proxy,
                    request_deserializer=protocol_dot_gaia_dot_proxy_dot_proxy__pb2.ProxyRequest.FromString,
                    response_serializer=protocol_dot_gaia_dot_proxy_dot_proxy__pb2.ProxyResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'protocol.gaia.proxy.GaiaProxyGrpc', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class GaiaProxyGrpc(object):
    """Missing associated documentation comment in .proto file"""

    @staticmethod
    def Ping(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/protocol.gaia.proxy.GaiaProxyGrpc/Ping',
            protocol_dot_gaia_dot_proxy_dot_ping__pb2.PingRequest.SerializeToString,
            protocol_dot_gaia_dot_proxy_dot_ping__pb2.PingResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListPartner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/protocol.gaia.proxy.GaiaProxyGrpc/ListPartner',
            protocol_dot_gaia_dot_proxy_dot_partner__pb2.ListPartnerRequest.SerializeToString,
            protocol_dot_gaia_dot_proxy_dot_partner__pb2.ListPartnerResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetPartner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/protocol.gaia.proxy.GaiaProxyGrpc/GetPartner',
            protocol_dot_gaia_dot_proxy_dot_partner__pb2.GetPartnerRequest.SerializeToString,
            protocol_dot_gaia_dot_proxy_dot_partner__pb2.GetPartnerResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddPartner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/protocol.gaia.proxy.GaiaProxyGrpc/AddPartner',
            protocol_dot_gaia_dot_proxy_dot_partner__pb2.AddPartnerRequest.SerializeToString,
            protocol_dot_gaia_dot_proxy_dot_partner__pb2.AddPartnerResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Proxy(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/protocol.gaia.proxy.GaiaProxyGrpc/Proxy',
            protocol_dot_gaia_dot_proxy_dot_proxy__pb2.ProxyRequest.SerializeToString,
            protocol_dot_gaia_dot_proxy_dot_proxy__pb2.ProxyResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

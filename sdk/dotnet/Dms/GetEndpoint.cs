// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dms
{
    public static class GetEndpoint
    {
        /// <summary>
        /// Data source for managing an AWS DMS (Database Migration) Endpoint.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Dms.GetEndpoint.Invoke(new()
        ///     {
        ///         EndpointId = "test_id",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEndpointResult> InvokeAsync(GetEndpointArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEndpointResult>("aws:dms/getEndpoint:getEndpoint", args ?? new GetEndpointArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for managing an AWS DMS (Database Migration) Endpoint.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Dms.GetEndpoint.Invoke(new()
        ///     {
        ///         EndpointId = "test_id",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEndpointResult> Invoke(GetEndpointInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointResult>("aws:dms/getEndpoint:getEndpoint", args ?? new GetEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointArgs : global::Pulumi.InvokeArgs
    {
        [Input("elasticsearchSettings")]
        private List<Inputs.GetEndpointElasticsearchSettingArgs>? _elasticsearchSettings;
        public List<Inputs.GetEndpointElasticsearchSettingArgs> ElasticsearchSettings
        {
            get => _elasticsearchSettings ?? (_elasticsearchSettings = new List<Inputs.GetEndpointElasticsearchSettingArgs>());
            set => _elasticsearchSettings = value;
        }

        /// <summary>
        /// Database endpoint identifier. Identifiers must contain from 1 to 255 alphanumeric characters or hyphens, begin with a letter, contain only ASCII letters, digits, and hyphens, not end with a hyphen, and not contain two consecutive hyphens.
        /// </summary>
        [Input("endpointId", required: true)]
        public string EndpointId { get; set; } = null!;

        [Input("extraConnectionAttributes")]
        public string? ExtraConnectionAttributes { get; set; }

        [Input("kafkaSettings")]
        private List<Inputs.GetEndpointKafkaSettingArgs>? _kafkaSettings;
        public List<Inputs.GetEndpointKafkaSettingArgs> KafkaSettings
        {
            get => _kafkaSettings ?? (_kafkaSettings = new List<Inputs.GetEndpointKafkaSettingArgs>());
            set => _kafkaSettings = value;
        }

        [Input("mongodbSettings")]
        private List<Inputs.GetEndpointMongodbSettingArgs>? _mongodbSettings;
        public List<Inputs.GetEndpointMongodbSettingArgs> MongodbSettings
        {
            get => _mongodbSettings ?? (_mongodbSettings = new List<Inputs.GetEndpointMongodbSettingArgs>());
            set => _mongodbSettings = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetEndpointArgs()
        {
        }
        public static new GetEndpointArgs Empty => new GetEndpointArgs();
    }

    public sealed class GetEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("elasticsearchSettings")]
        private InputList<Inputs.GetEndpointElasticsearchSettingInputArgs>? _elasticsearchSettings;
        public InputList<Inputs.GetEndpointElasticsearchSettingInputArgs> ElasticsearchSettings
        {
            get => _elasticsearchSettings ?? (_elasticsearchSettings = new InputList<Inputs.GetEndpointElasticsearchSettingInputArgs>());
            set => _elasticsearchSettings = value;
        }

        /// <summary>
        /// Database endpoint identifier. Identifiers must contain from 1 to 255 alphanumeric characters or hyphens, begin with a letter, contain only ASCII letters, digits, and hyphens, not end with a hyphen, and not contain two consecutive hyphens.
        /// </summary>
        [Input("endpointId", required: true)]
        public Input<string> EndpointId { get; set; } = null!;

        [Input("extraConnectionAttributes")]
        public Input<string>? ExtraConnectionAttributes { get; set; }

        [Input("kafkaSettings")]
        private InputList<Inputs.GetEndpointKafkaSettingInputArgs>? _kafkaSettings;
        public InputList<Inputs.GetEndpointKafkaSettingInputArgs> KafkaSettings
        {
            get => _kafkaSettings ?? (_kafkaSettings = new InputList<Inputs.GetEndpointKafkaSettingInputArgs>());
            set => _kafkaSettings = value;
        }

        [Input("mongodbSettings")]
        private InputList<Inputs.GetEndpointMongodbSettingInputArgs>? _mongodbSettings;
        public InputList<Inputs.GetEndpointMongodbSettingInputArgs> MongodbSettings
        {
            get => _mongodbSettings ?? (_mongodbSettings = new InputList<Inputs.GetEndpointMongodbSettingInputArgs>());
            set => _mongodbSettings = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetEndpointInvokeArgs()
        {
        }
        public static new GetEndpointInvokeArgs Empty => new GetEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetEndpointResult
    {
        public readonly string CertificateArn;
        public readonly string DatabaseName;
        public readonly ImmutableArray<Outputs.GetEndpointElasticsearchSettingResult> ElasticsearchSettings;
        public readonly string EndpointArn;
        public readonly string EndpointId;
        public readonly string EndpointType;
        public readonly string EngineName;
        public readonly string? ExtraConnectionAttributes;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetEndpointKafkaSettingResult> KafkaSettings;
        public readonly ImmutableArray<Outputs.GetEndpointKinesisSettingResult> KinesisSettings;
        public readonly string KmsKeyArn;
        public readonly ImmutableArray<Outputs.GetEndpointMongodbSettingResult> MongodbSettings;
        public readonly string Password;
        public readonly int Port;
        public readonly ImmutableArray<Outputs.GetEndpointRedisSettingResult> RedisSettings;
        public readonly ImmutableArray<Outputs.GetEndpointRedshiftSettingResult> RedshiftSettings;
        public readonly ImmutableArray<Outputs.GetEndpointS3SettingResult> S3Settings;
        public readonly string SecretsManagerAccessRoleArn;
        public readonly string SecretsManagerArn;
        public readonly string ServerName;
        public readonly string ServiceAccessRole;
        public readonly string SslMode;
        public readonly ImmutableDictionary<string, string> Tags;
        public readonly string Username;

        [OutputConstructor]
        private GetEndpointResult(
            string certificateArn,

            string databaseName,

            ImmutableArray<Outputs.GetEndpointElasticsearchSettingResult> elasticsearchSettings,

            string endpointArn,

            string endpointId,

            string endpointType,

            string engineName,

            string? extraConnectionAttributes,

            string id,

            ImmutableArray<Outputs.GetEndpointKafkaSettingResult> kafkaSettings,

            ImmutableArray<Outputs.GetEndpointKinesisSettingResult> kinesisSettings,

            string kmsKeyArn,

            ImmutableArray<Outputs.GetEndpointMongodbSettingResult> mongodbSettings,

            string password,

            int port,

            ImmutableArray<Outputs.GetEndpointRedisSettingResult> redisSettings,

            ImmutableArray<Outputs.GetEndpointRedshiftSettingResult> redshiftSettings,

            ImmutableArray<Outputs.GetEndpointS3SettingResult> s3Settings,

            string secretsManagerAccessRoleArn,

            string secretsManagerArn,

            string serverName,

            string serviceAccessRole,

            string sslMode,

            ImmutableDictionary<string, string> tags,

            string username)
        {
            CertificateArn = certificateArn;
            DatabaseName = databaseName;
            ElasticsearchSettings = elasticsearchSettings;
            EndpointArn = endpointArn;
            EndpointId = endpointId;
            EndpointType = endpointType;
            EngineName = engineName;
            ExtraConnectionAttributes = extraConnectionAttributes;
            Id = id;
            KafkaSettings = kafkaSettings;
            KinesisSettings = kinesisSettings;
            KmsKeyArn = kmsKeyArn;
            MongodbSettings = mongodbSettings;
            Password = password;
            Port = port;
            RedisSettings = redisSettings;
            RedshiftSettings = redshiftSettings;
            S3Settings = s3Settings;
            SecretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
            SecretsManagerArn = secretsManagerArn;
            ServerName = serverName;
            ServiceAccessRole = serviceAccessRole;
            SslMode = sslMode;
            Tags = tags;
            Username = username;
        }
    }
}

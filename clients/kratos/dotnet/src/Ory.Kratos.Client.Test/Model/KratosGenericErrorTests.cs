/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.6-alpha.7
 * Contact: hi@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ory.Kratos.Client.Api;
using Ory.Kratos.Client.Model;
using Ory.Kratos.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ory.Kratos.Client.Test.Model
{
    /// <summary>
    ///  Class for testing KratosGenericError
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class KratosGenericErrorTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for KratosGenericError
        //private KratosGenericError instance;

        public KratosGenericErrorTests()
        {
            // TODO uncomment below to create an instance of KratosGenericError
            //instance = new KratosGenericError();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of KratosGenericError
        /// </summary>
        [Fact]
        public void KratosGenericErrorInstanceTest()
        {
            // TODO uncomment below to test "IsType" KratosGenericError
            //Assert.IsType<KratosGenericError>(instance);
        }


        /// <summary>
        /// Test the property 'Code'
        /// </summary>
        [Fact]
        public void CodeTest()
        {
            // TODO unit test for the property 'Code'
        }
        /// <summary>
        /// Test the property 'Debug'
        /// </summary>
        [Fact]
        public void DebugTest()
        {
            // TODO unit test for the property 'Debug'
        }
        /// <summary>
        /// Test the property 'Details'
        /// </summary>
        [Fact]
        public void DetailsTest()
        {
            // TODO unit test for the property 'Details'
        }
        /// <summary>
        /// Test the property 'Message'
        /// </summary>
        [Fact]
        public void MessageTest()
        {
            // TODO unit test for the property 'Message'
        }
        /// <summary>
        /// Test the property 'Reason'
        /// </summary>
        [Fact]
        public void ReasonTest()
        {
            // TODO unit test for the property 'Reason'
        }
        /// <summary>
        /// Test the property 'Request'
        /// </summary>
        [Fact]
        public void RequestTest()
        {
            // TODO unit test for the property 'Request'
        }
        /// <summary>
        /// Test the property 'Status'
        /// </summary>
        [Fact]
        public void StatusTest()
        {
            // TODO unit test for the property 'Status'
        }

    }

}

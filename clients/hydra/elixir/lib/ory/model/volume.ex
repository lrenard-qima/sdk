# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.Volume do
  @moduledoc """
  Volume volume
  """

  @derive [Poison.Encoder]
  defstruct [
    :"CreatedAt",
    :"Driver",
    :"Labels",
    :"Mountpoint",
    :"Name",
    :"Options",
    :"Scope",
    :"Status",
    :"UsageData"
  ]

  @type t :: %__MODULE__{
    :"CreatedAt" => String.t | nil,
    :"Driver" => String.t,
    :"Labels" => %{optional(String.t) => String.t},
    :"Mountpoint" => String.t,
    :"Name" => String.t,
    :"Options" => %{optional(String.t) => String.t},
    :"Scope" => String.t,
    :"Status" => map() | nil,
    :"UsageData" => Ory.Model.VolumeUsageData.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.Volume do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"UsageData", :struct, Ory.Model.VolumeUsageData, options)
  end
end


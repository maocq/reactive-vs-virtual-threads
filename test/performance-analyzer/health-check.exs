import Config

config :distributed_performance_analyzer,
  url: "http://_IP_:8080/api/hello",
  request: %{
    method: "GET",
    headers: [],
    body: ""
  },
  execution: %{
    steps: 20,
    increment: 20,
    duration: 2000,
    constant_load: false,
    dataset: :none,
    separator: ","
  },
  distributed: :none

config :logger,
  level: :warn

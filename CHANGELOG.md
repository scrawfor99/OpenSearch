# CHANGELOG
All notable changes to this project are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html). See the [CONTRIBUTING guide](./CONTRIBUTING.md#Changelog) for instructions on how to add changelog entries.

## [Unreleased 2.8.x]
### Added
- Add server version as REST response header [#6583](https://github.com/opensearch-project/OpenSearch/issues/6583)
- Start replication checkpointTimers on primary before segments upload to remote store. ([#8221]()https://github.com/opensearch-project/OpenSearch/pull/8221)
- Introduce new static cluster setting to control slice computation for concurrent segment search. ([#8847](https://github.com/opensearch-project/OpenSearch/pull/8884))
- Add configuration for file cache size to max remote data ratio to prevent oversubscription of file cache ([#8606](https://github.com/opensearch-project/OpenSearch/pull/8606))
- Disallow compression level to be set for default and best_compression index codecs ([#8737]()https://github.com/opensearch-project/OpenSearch/pull/8737)
- [distribution/archives] [Linux] [x64] Provide the variant of the distributions bundled with JRE ([#8195]()https://github.com/opensearch-project/OpenSearch/pull/8195)
- Prioritize replica shard movement during shard relocation ([#8875](https://github.com/opensearch-project/OpenSearch/pull/8875))
- Introducing Default and Best Compression codecs as their algorithm name ([#9123]()https://github.com/opensearch-project/OpenSearch/pull/9123)
- Make SearchTemplateRequest implement IndicesRequest.Replaceable ([#9122]()https://github.com/opensearch-project/OpenSearch/pull/9122)
- [BWC and API enforcement] Define the initial set of annotations, their meaning and relations between them ([#9223](https://github.com/opensearch-project/OpenSearch/pull/9223))
- [Remote Store] Add Segment download stats to remotestore stats API ([#8718](https://github.com/opensearch-project/OpenSearch/pull/8718))
- [Remote Store] Add remote segment transfer stats on NodesStats API ([#9168](https://github.com/opensearch-project/OpenSearch/pull/9168))
- [Segment Replication] Support realtime reads for GET requests ([#9212](https://github.com/opensearch-project/OpenSearch/pull/9212))
- Allow test clusters to run with TLS ([#8900](https://github.com/opensearch-project/OpenSearch/pull/8900))

### Dependencies

### Changed

### Deprecated

### Removed

### Fixed

### Security

[Unreleased 2.x]: https://github.com/opensearch-project/OpenSearch/compare/2.8...2.x

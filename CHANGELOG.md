# CHANGELOG
All notable changes to this project are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html). See the [CONTRIBUTING guide](./CONTRIBUTING.md#Changelog) for instructions on how to add changelog entries.

## [Unreleased 2.10]
### Added

- Support for HTTP/2 (server-side) ([#3847](https://github.com/opensearch-project/OpenSearch/pull/3847))
- Add getter for path field in NestedQueryBuilder ([#4636](https://github.com/opensearch-project/OpenSearch/pull/4636))
- Allow mmap to use new JDK-19 preview APIs in Apache Lucene 9.4+ ([#5151](https://github.com/opensearch-project/OpenSearch/pull/5151))
- Add events correlation engine plugin ([#6854](https://github.com/opensearch-project/OpenSearch/issues/6854))
- Introduce new dynamic cluster setting to control slice computation for concurrent segment search ([#9107](https://github.com/opensearch-project/OpenSearch/pull/9107))
- Implement on behalf of token passing for extensions ([#8679](https://github.com/opensearch-project/OpenSearch/pull/8679))

### Dependencies

### Changed

### Deprecated

### Removed

### Fixed

### Security

[Unreleased 2.10]: https://github.com/opensearch-project/OpenSearch/compare/2.10...2.10

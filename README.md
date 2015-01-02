SO_AJ_MavenMultiModule
======================

Maven multi-module project with a setup involving multiple AspectJ ITD aspects,
each in a separate module, which are applied to the same application module.

The main requirement for me setting this up was to avoid a dependency chain between
the aspect modules, i.e. each aspect module should depend on the core module,
but not need to know anything about any other aspect module.

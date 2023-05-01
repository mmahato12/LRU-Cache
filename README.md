# LRU-Cache
## Introduction
LRU cache is a cache eviction algorithm that organizes elements in order of use. In LRU, the element that hasn't been used for the longest time will be evicted from the cache.
We have implemented the low level design for a Cache system. Our cache will have support to the following operations:

### Cammands
* **get <Key>** : returns value if present, otherwise -1;
* **put <Key> <Value>** : Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
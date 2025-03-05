# CC1_IEEE
## Complexity Analysis
### Doubly Linked List
| Operation  | Time Complexity | Space Complexity |
|------------|----------------|------------------|
| Insert Head | O(1) | O(n) |
| Insert Tail | O(1) | O(n) |
| Traverse Forward/Backward | O(n) | O(1) |

### Interval Merger
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| `addInterval()` | O(log n) | O(n) |
| `getIntervals()` | O(n) | O(n) |

### Time-Based Cache
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| `set(key, value, expiryTime)` | O(1) | O(n) |
| `get(key)` | O(n) | O(n) |
| `cleanExpiredKeys()` | O(n) | O(n) |

### Stack with Min/Max
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Push | O(1) | O(n) |
| Pop | O(1) | O(n) |
| Top | O(1) | O(1) |
| GetMin | O(1) | O(1) |
| GetMax | O(1) | O(1) |

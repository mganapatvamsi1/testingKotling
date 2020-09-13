package main.func.classes

enum class EnumClasses {
    MINOR {
        override fun text(): String {
            return "[Minor Priority]"
        }
    },
    NORMAL {
        override fun text(): String {
            return "[NoRmAl]"
        }
    },
    MAJOR {
        override fun text(): String {
            return "[MaJoR]"
        }
    },
    CRITICAL {
        override fun text(): String {
            return "[CrItIcAl]"
        }
    };

    abstract fun text(): String
}

enum class Priority(val value: Int) {
    MINORITY(-1) {
        override fun toString(): String {
            return "this is just a minor all the time"
        }
    },
    NORMALITY(0),
    MAJORITY(1),
    CRITICALITY(10),
    SUPERIORITY(35)
}

fun main(args: Array<String>) {
    val enumClasses = EnumClasses.NORMAL
    println(enumClasses)
    val majorityPriority = Priority.MAJORITY
    println(majorityPriority.value)

    println(Priority.MINORITY.ordinal)
    println(Priority.NORMALITY.ordinal)
    println(Priority.MAJORITY.ordinal)
    println(Priority.CRITICALITY.ordinal)

    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }
    val superiority = Priority.valueOf("SUPERIORITY")
    println(superiority.value)
    println(superiority.ordinal)
    println()
    val newMinority = Priority.MINORITY
    println(newMinority)
    println()
    println()
    val oldMinor = EnumClasses.MINOR
    println(oldMinor.text())
    val oldCritical = EnumClasses.CRITICAL
    println(oldCritical.text())


}
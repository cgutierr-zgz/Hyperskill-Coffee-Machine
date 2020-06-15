object PlayingField {
    object Size {
        var width: Int = 0
        var height: Int = 0
        fun changeSize(width: Int, height: Int) {
            if (width > 0) this.width = width
            if (height > 0) this.height = height
        }
    }
}
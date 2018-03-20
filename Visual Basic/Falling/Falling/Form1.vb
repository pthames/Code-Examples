Public Class Form1
    'Phillip Thames ---Falling Program

    'Here is my function to take in the value of falltime then calculate distancefell
    'and return value to the calling program
    Function fallingDistance(ByVal fallTime As Decimal) As Decimal
        'holder variable for distancefell
        Dim distanceFell2 As Decimal
        distanceFell2 = CDec((1 / 2) * 9.8 * (fallTime) ^ 2)
        'sends info back
        Return distanceFell2


    End Function

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'variables
        Dim fallTime As Decimal
        Dim distanceFell As Decimal
        'gets user input
        fallTime = CDec(txtTimeInSeconds.Text)

        'Try-catch blocks
        If fallTime <= 0 Then
            MessageBox.Show("Please enter a positive value for time")
            txtTimeInSeconds.Clear()
        End If

        If fallTime > 0 Then
            'Calls function
            distanceFell = fallingDistance(fallTime)
            'receives info from function
            txtDistanceFell.Text = distanceFell.ToString("")

        End If



    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

       
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        txtDistanceFell.Clear()
        txtTimeInSeconds.Clear()

    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()

    End Sub
End Class

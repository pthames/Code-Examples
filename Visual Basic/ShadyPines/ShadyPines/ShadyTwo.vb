Public Class ShadyTwo



    Private Sub RadOne_CheckedChanged(sender As Object, e As EventArgs) Handles RadOne.CheckedChanged
        If RadOne.Checked Then
            GroupBox3.Visible = False
        End If
    End Sub

    Private Sub GroupBox1_Enter(sender As Object, e As EventArgs) Handles GroupBox1.Enter

    End Sub

    Private Sub RadioButton5_CheckedChanged(sender As Object, e As EventArgs) Handles Rad21One.CheckedChanged

    End Sub

    Private Sub RadioButton2_CheckedChanged(sender As Object, e As EventArgs) Handles RadTwo.CheckedChanged
        If RadTwo.Checked Then
            GroupBox3.Visible = True
        End If
    End Sub

    Public Sub Button1_Click(sender As Object, e As EventArgs) Handles btnReturn.Click

        Dim Tenants As Integer
        Dim MealOne As Integer
        Dim MealTwo As Integer


        If RadOne.Checked Then
            Tenants = 1
        ElseIf RadTwo.Checked Then
            Tenants = 2
        End If
        If Rad7One.Checked Then
            MealOne = 400
        End If
        If Rad14One.Checked Then
            MealOne = 710
        End If
        If Rad21One.Checked Then
            MealOne = 980
        End If
        If Rad7Two.Checked Then
            MealTwo = 400
        End If
        If Rad14Two.Checked Then
            MealTwo = 710
        End If
        If Rad21Two.Checked Then
            MealTwo = 980
        End If

        ShadyOne.PullData(Tenants, MealOne, MealTwo)


        Me.Close()
    End Sub

   
End Class